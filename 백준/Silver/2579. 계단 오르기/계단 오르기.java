

import java.io.*;
import java.util.*;

public class Main {
    static int[] stairs;
    static int[][] dp = new int[302][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stairs = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(stairs[1]);
            return;
        }

        for (int i = 0; i < 302; i++) {
            Arrays.fill(dp[i], -1);
        }

        dp[1][1] = stairs[1];
        dp[1][2] = stairs[1];
        dp[2][1] = stairs[2];
        dp[2][2] = stairs[1] + stairs[2];

        if (n == 2) {
            System.out.println(Math.max(dp[2][1], dp[2][2]));
            return;
        }

        for (int i = 3; i <= n; i++) {
            dp[i][1] = Math.max(dp[i - 2][1] + stairs[i], dp[i - 2][2] + stairs[i]);
            dp[i][2] = dp[i - 1][1] + stairs[i];
        }

        System.out.println(Math.max(dp[n][1], dp[n][2]));
    }
}
