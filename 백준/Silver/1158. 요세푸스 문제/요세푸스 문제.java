

import java.util.*;

public class Main {

    static int[] pre = new int[5001];
    static int[] nxt = new int[5001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Deque<Integer> que = new ArrayDeque<>();

        int len = 0;

        for (int i = 1; i <= n; i++) {
            pre[i] = (i == 1) ? n : i - 1;
            nxt[i] = (i == n) ? 1 : i + 1;
            len++;
        }

        int idx = 1;
        for (int cur = 1; len != 0; cur = nxt[cur]) {
            if (idx == k) {
                que.offer(cur);
                pre[nxt[cur]] = pre[cur];
                nxt[pre[cur]] = nxt[cur];
                idx = 1;
                len--;
            } else {
                idx++;
            }
        }

        System.out.print("<");
        int size = que.size();
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(que.poll() + ", ");
            } else {
                System.out.print(que.poll() + ">");
            }
        }

    }
}
