

import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int a, b, c;
    static int[][] mp;
    static int[] cnt = new int[3]; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        mp = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                mp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        go(0, 0, n);
        for (int i = 0; i < 3; i++) {
            System.out.println(cnt[i]);
        }

    }

    static void go(int x, int y, int z) {
        if (check(x, y, z)) {
            cnt[mp[x][y] + 1] += 1;
            return ;
        }    

        int n = z / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                go(x + i * n, y  + j * n, n);
            }
        }

    }

    static boolean check(int x, int y, int n) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (mp[x][y] != mp[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
