

import java.io.*;
import java.util.*;

public class Main {
    static char[][] mp;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        mp = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mp[i], '*');
        }
        // System.out.println(Arrays.deepToString(mp));
        go(0, 0, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(mp[i][j]);
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

    static void go(int y, int x, int n) {
        if (n == 1) {
            return ;
        }

        go(y, x, n/3);
        go(y, x + n/3, n/3);
        go(y, x + 2 * n/3, n/3);
        go(y + n/3, x, n/3);
        empt(y + n/3, x + n/3, n/3);
        go(y + n/3, x + 2 * n/3, n/3);
        go(y + 2 * n/3, x, n/3);
        go(y + 2 * n/3,  x + n/3, n/3);
        go(y + 2 * n/3, x + 2 * n/3, n/3);
    }

    static void empt(int y, int x, int n) {
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                mp[i][j] = ' ';
            }
        }
    }
}

//9등분을 해야될거같다.