import java.io.*;

public class Main {

    static char[][] board;
    static int n;

    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new char[n][n * 2 - 1];

        // 공백으로 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                board[i][j] = ' ';
            }
        }

        func(n, 0, n - 1);

        // 빠른 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(board[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void fillStar(int x, int y) {
        board[x][y] = '*';
        board[x + 1][y - 1] = '*';
        board[x + 1][y + 1] = '*';
        for (int i = y - 2; i <= y + 2; i++) {
            board[x + 2][i] = '*';
        }
    }

    static void func(int size, int x, int y) {
        if (size == 3) {
            fillStar(x, y);
            return;
        }

        int newSize = size / 2;
        func(newSize, x, y); // 위쪽
        func(newSize, x + newSize, y - newSize); // 왼쪽 아래
        func(newSize, x + newSize, y + newSize); // 오른쪽 아래
    }
}
