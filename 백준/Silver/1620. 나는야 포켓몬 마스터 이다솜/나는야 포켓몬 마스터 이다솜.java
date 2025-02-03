

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> mp1 = new HashMap<>();
        Map<String, Integer> mp2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            mp1.put(i, s);
            mp2.put(s, i);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            if (Character.isLetter(arr[0])) {
                System.out.println(mp2.get(s));
            } else {
                System.out.println(mp1.get(Integer.parseInt(s)));
            }
        }

    }
}
