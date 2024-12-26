
import java.util.*;


//3가지 방식을 동시에 진행하는 방향으로 간다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] visited = new int[1000004];
        Arrays.fill(visited, 0);

        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        visited[num] = 1; // 시작 숫자의 방문 표시

        int ret = 0;

        while (!q.isEmpty()) {
            int a = q.poll();
            if (a == 1) { // 목표 숫자 도달
                ret = visited[a];
                break;
            }

            // a를 3으로 나누는 경우
            if (a % 3 == 0 && visited[a / 3] == 0) {
                q.add(a / 3);
                visited[a / 3] = visited[a] + 1;
            }

            // a를 2로 나누는 경우
            if (a % 2 == 0 && visited[a / 2] == 0) {
                q.add(a / 2);
                visited[a / 2] = visited[a] + 1;
            }

            // a에서 1을 빼는 경우
            if (a - 1 >= 0 && visited[a - 1] == 0) {
                q.add(a - 1);
                visited[a - 1] = visited[a] + 1;
            }
        }

        // 출력 (초기 값 포함하므로 -1)
        System.out.println(ret - 1);
    }
}
