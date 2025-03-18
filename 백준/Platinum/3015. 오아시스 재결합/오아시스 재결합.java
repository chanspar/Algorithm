

import java.util.*;

public class Main {
    static long ret;
    public static void main(String[] args) {
        Deque<Pair> stack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n-- > 0) {
            int h = sc.nextInt();
            int cnt = 1;

            while (!stack.isEmpty() && stack.peek().height <= h) {
                ret += stack.peek().cnt;
                if (stack.peek().height == h)
                    cnt += stack.peek().cnt;
                stack.pop();
            }

            if (!stack.isEmpty())
                ret++;

            stack.push(new Pair(h, cnt));
        }

        System.out.println(ret);
                
    }
}



class Pair {
    int height, cnt;

    public Pair(int height, int cnt) {
        this.height = height;
        this.cnt = cnt;
    }
}
