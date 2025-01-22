
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s;

        while (true) {
            s = sc.nextLine();
            if (s.equals("0")) break;

            StringBuilder sb = new StringBuilder(s);

            if (s.equals(sb.reverse().toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
