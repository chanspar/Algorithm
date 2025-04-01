

import java.util.*;

// 나누기 3 나누기 2 아니면 1빼기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dp[] = new int[n + 1];
        int trace[] = new int[n + 1];

        Arrays.fill(dp, 1000002);
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            trace[i] = i - 1;

            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
                trace[i] = i / 2;
            }
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
                dp[i] = dp[i/ 3] + 1;
                trace[i] = i / 3;
            }
        }

        System.out.println(dp[n]);

        while (n > 0) {
            System.out.print(n + " ");
            n = trace[n];
        }
        

    }
}

