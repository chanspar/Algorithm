import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<int []> dq = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!dq.isEmpty() && dq.peekLast()[1] >= num) {
                dq.pollLast();
            }

            dq.addLast(new int[]{i, num});

            if (dq.peekFirst()[0] <= i - l) {
                dq.pollFirst();
            }
            
            bw.write(dq.peekFirst()[1] + " ");
        }

        bw.flush();
        bw.close();

    }
}
