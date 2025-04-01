
import java.io.*;
import java.util.*;

// 1. 짧은 거 먼저
// 길이 같으면 자리수 합 비교 작은 합 먼저 (숫자인것만)
// 사전순
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> li = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            li.add(br.readLine());
        }

        li.sort((a,b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            int sumA = sumNum(a);
            int sumB = sumNum(b);
            if (sumA != sumB) {
                return sumA - sumB; // 2. 숫자 합이 작은 순
            }
            return a.compareTo(b); // 3. 사전순 정렬
        });

        for (String s : li) {
            // System.out.println(sumNum(s));
            System.out.println(s);
        }

    }   

    static int sumNum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }

        return sum;
    }
}
