
import java.util.Scanner;


// 초콜릿은 정사각형 n개로 이루어진 막대 모양, 크기는 항상 2의 제곱
// k개의 정사각형을 먹으면 잠 깸 
// 항상 쪼개는건 가운데로만 쪼개진다. 정사각형이 d개 있는 막대는 d/2로 쪼개짐
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 먹어야하는 초콜릿 

        // 사야하는 초콜릿 k 보다 큰거 물론 2의 제곱중
        int buy = 1;

        while (k > buy) {
            buy *= 2;
        }

        if (k == buy) 
        {
            System.out.println(buy + " " + 0);
            return ;
        }

        // 쪼개봅시다.
        // 16 8 4 2 1  
        // 14-> 8 + 4 + 2 
        // 8 - > 0 , 7 -> 4 + 2 + 1 (1), 6 -> 4 + 2 (2)
        // 5 -> 4 + 1 (2)  (1)   
        int crush = 0;
        int goal = 0 ;
        int tmp = buy;
        while (k != goal) {
            crush++;
            tmp = tmp / 2;
            goal += tmp;
            if (goal > k) {
                goal -= tmp;
            }
        }

        System.out.println(buy + " " + crush);
    }
}
