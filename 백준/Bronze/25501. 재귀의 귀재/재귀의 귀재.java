

import java.util.*;
import java.io.*;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            cnt = 0;
            int result = isPalindrome(arr);

            System.out.println(result + " " + cnt);
        }



    }


    private static int recursion(char[] s, int l, int r) {
        if (l >= r) {
            cnt++;
            return 1;
        } 
        else if (s[l] != s[r]){
            cnt++;
            return 0;
        } 
        else {
            cnt++;
            return recursion(s, l + 1, r - 1);
        }
    }

    private static int isPalindrome(char[] s) {
        return recursion(s, 0, s.length - 1);
    }
}
