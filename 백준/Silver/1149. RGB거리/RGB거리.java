

import java.util.Scanner;

public class Main {
    static int[][] d = new int[1005][4];
    static int[][] s = new int[1005][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            s[i][1] = sc.nextInt();
            s[i][2] = sc.nextInt();
            s[i][3] = sc.nextInt();
        }

        // 초기값 설정
        d[1][1] = s[1][1];
        d[1][2] = s[1][2];
        d[1][3] = s[1][3];

        // DP 계산
        for (int i = 2; i <= n; i++) {
            d[i][1] = Math.min(d[i-1][2], d[i-1][3]) + s[i][1];
            d[i][2] = Math.min(d[i-1][1], d[i-1][3]) + s[i][2];
            d[i][3] = Math.min(d[i-1][1], d[i-1][2]) + s[i][3];
        }

        // 결과 출력
        System.out.println(Math.min(Math.min(d[n][1], d[n][2]), d[n][3]));
    }
}
