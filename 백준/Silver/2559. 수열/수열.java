
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int arr[] = new int[a + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= a; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        int maximum = -10000000;

        for(int i = b ; i <= a; i++) {
            if (maximum <  arr[i] - arr [i - b]) {
                maximum = arr[i] - arr[i - b];
            }
        }

        System.out.println(maximum);
        
    }
    
}
