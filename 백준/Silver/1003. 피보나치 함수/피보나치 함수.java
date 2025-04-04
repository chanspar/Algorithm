

import java.io.*;

public class Main {
    static int zero, one;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            dp = new int[n + 1][2];
            dp[0][0] = 1; dp[0][1] = 0; 
            if (n != 0) {
                dp[1][0] = 0;  dp[1][1] = 1;
            }

            for (int i = 2; i <= n; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            }

            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
    
}

// 테이블 dp[n][2] 로 만들어서 숫자n의 0 1 출력 숫자를 저장

// 점화식 dp[n][0] = dp[n - 1][0] + dp[n - 2][0]  dp[n][1] = dp[n-1][1] + dp[n-2][1]

// 초기 조건  dp[0][0] = 1 dp[0][1] = 0    dp[1][0] = 0 dp[1][1] = 1