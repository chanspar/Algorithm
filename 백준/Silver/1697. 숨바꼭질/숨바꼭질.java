

import java.io.*;
import java.util.*;

// 한좌표에서만 이동
// 걷기 x - 1 or  x + 1
// 순간이동 2*x

public class Main {

    static int[] dp = new int[100002];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n == k) {
            System.out.println(0);
            return ;
        }

        int[] visited = new int[100002];
        Arrays.fill(visited, -1);

        Deque<Integer> q = new ArrayDeque<>();

        q.offer(n);
        visited[n] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (0 <= i && i <= 100000 && visited[i] == -1) {
                    visited[i] = visited[cur] + 1;
                    q.offer(i);

                    if (i == k) {
                        System.out.println(visited[i]);
                        return ;
                    }
                }
            }
        }



    }

}
