

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        int idx = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '*') {
                idx = i;
            }
        }

        String pre = pattern.substring(0, idx);
        String post = pattern.substring(idx + 1);

        String reversedPost = new StringBuilder(post).reverse().toString();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < pattern.length() - 1) {
                System.out.println("NE");
                continue;
            }

            if (!s.substring(0, idx).equals(pre)) {
                System.out.println("NE");
                continue;
            }
            String reversedS = new StringBuilder(s).reverse().toString();
            if (!reversedS.substring(0, post.length()).equals(reversedPost)) {
                System.out.println("NE");
            } else {
                System.out.println("DA");
            }
        }
    }
}
