
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, (a,b) -> b - a);
        int ret = 0;

        for (int i = 0; i < n; i++) {
            while (k > 0) {
                ret++;
                k -= arr[i];
            }
            if (k < 0) {
                k += arr[i];
                ret--;
            }
            if (k == 0) break;
        }

        System.out.println(ret);


    }
}
