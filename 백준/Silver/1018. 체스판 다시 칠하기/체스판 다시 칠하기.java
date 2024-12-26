

import java.util.*;
import java.io.*;

//NxM 크기의 보드 (8 <= N, M <= 50)
// 체스판은 검정 칸과 흰 칸이 번갈아서 칠해져 있어야 한다.
// 8 x 8 크기의 체스판 만들어서 최소로 칠해야 하는 정사각형 개수 구하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chessBoard = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                chessBoard[i][j] = line.charAt(j);
            }
        }
        
        int min = 2147483647;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (chessBoard[x][y] != 'W') {
                                count++;
                            }
                        } else {
                            if (chessBoard[x][y] != 'B') {
                                count++;
                            }
                        }
                    }
                }
                min = Math.min(min, count);
                count = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (chessBoard[x][y] != 'B') {
                                count++;
                            }
                        } else {
                            if (chessBoard[x][y] != 'W') {
                                count++;
                            }
                        }
                    }
                }
                min = Math.min(min, count);
            }
        }
        System.out.println(min);

    }
}
