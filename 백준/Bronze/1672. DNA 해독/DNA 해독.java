
import java.util.Scanner;

public class Main {

    static char[][] arr = {
        {'A', 'C', 'A', 'G'},
        {'C', 'G', 'T', 'A'},
        {'A', 'T', 'C', 'G'},
        {'G', 'A', 'G', 'T'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        // StringBuilder를 사용해 문자열을 수정
        StringBuilder sb = new StringBuilder(str);

        // 뒤에서부터 계산
        for (int i = n - 1; i > 0; i--) {
            int num1 = charToInt(sb.charAt(i - 1));
            int num2 = charToInt(sb.charAt(i));

            // 이전 문자를 결과로 대체
            sb.setCharAt(i - 1, arr[num1][num2]);
        }

        // 최종적으로 첫 번째 문자 출력
        System.out.println(sb.charAt(0));
    }

    static int charToInt(char c) {
        if (c == 'A') return 0;
        if (c == 'G') return 1;
        if (c == 'C') return 2;
        return 3; // 'T'
    }
}
