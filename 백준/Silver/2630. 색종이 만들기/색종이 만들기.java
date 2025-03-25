

import java.io.*;
import java.util.*;

public class Main {
    static int[][] mp;
    static int w, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mp = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                mp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        go(0,0, N);
        System.out.println(w);
        System.out.println(b);



    }
    static void go(int y, int x, int size) {
        int a = checkMap(y, x, size);
        if (a != -1) {
            if (a == 0) {
                w++;
            } else {
                b++;
            }
            return;
        }
        
        go(y, x, size / 2);
        go(y, x + size/2, size / 2);
        go(y + size/2, x, size/2);
        go(y + size/2, x + size/2, size/2);
    }

    static int checkMap(int y, int x, int size) {
        int a = mp[y][x];
        for (int i = y ; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (a != mp[i][j]) {
                    return -1;
                }
            }
        }
        return a;
    }

}

// 같은 숫자가 아니면 4등분을 해야됨
// 딱봐도 재귀문제 이네요 

// 0 ~ n/2, 0 ~ n/2       n/2 ~ n, 0 ~ n/2
// 0 ~ n/2, n/2 ~ n       n/2 ~ n, n/2 ~ n
// 그러면 영역을 4개로 나눠서 계속 반복시키면 될듯