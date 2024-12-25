
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//123456789101112131415 14 13 12 11 10 9  8  7  6  5  4  3  2  1  2  3456
//                      16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
//28개씩 반복된다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String result = "";
            int n = Integer.parseInt(br.readLine());
            int num = n % 28;
            if (num == 0) num = 28; 

            
            if (num > 15) {
                num = 30 - num;
            }

            int cnt = 4;
            while (num != 0) {
                if (num % 2 == 1) {
                    result = "딸기" + result;
                } else {
                    result = 'V' + result;
                }

                num = num / 2;
                cnt--;
            }

            while (cnt-- > 0) {
                result = 'V' + result;
            }

            System.out.println(result);
        }
    }
}
