

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder(s);

            if (s.length() == 1) {
                System.out.println(s);
            }
            for (int i = 0; i < s.length() - 1; i++) {
                if (checkPerin(sb) == true) {
                    System.out.println(sb.toString());
                    break ;
                }
                sb.reverse();
                sb.insert(s.length(), arr[i]);
                if (i == s.length() - 2) {
                    System.out.println(sb.toString());
                }
            }
        }

    }


    public static boolean checkPerin(StringBuilder s) {
        if (s.toString().equals(s.reverse().toString())) {
            return true;
        }
        return false;
    }

}
