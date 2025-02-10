
import java.io.*;
import java.util.*;

public class Main {
    static int a, b, c;
    static long ret;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(go(a,b,c));
        
    }

    static long go(int a, int b, int c) {
        if (b == 1) {
            return a % c;
        }

        ret = go(a, b/2, c);
        ret = ret * ret % c;
        if (b % 2 == 1) {
            ret = ret * a % c;
        }

        return ret;
    }
}
