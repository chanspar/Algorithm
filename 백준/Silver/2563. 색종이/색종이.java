

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] white = new int[100][100];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            fillWidth(a, b, white);
        }

        System.out.println(getBlack(white));
    }

    private static void fillWidth(int sx, int sy, int[][] arr) {
        int ex = sx + 10;
        int ey = sy + 10;

        if (ex > 100) {
            ex = 100;
        }
        if (ey > 100) {
            ey = 100;
        }

        for(int i = sx; i < ex; i++) {
            for (int j = sy; j < ey; j++) {
                arr[i][j] = 1;
            }
        }

    }

    private static int getBlack(int[][] arr) {
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
    
}
