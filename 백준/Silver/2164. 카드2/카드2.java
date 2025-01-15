
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            int tmp;
            queue.poll();
            tmp = queue.peek();
            queue.poll();
            queue.offer(tmp);
        }
        System.out.println(queue.peek());
    }
}
