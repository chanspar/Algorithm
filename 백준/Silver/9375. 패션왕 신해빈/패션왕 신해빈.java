
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> mp = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }

            int ret = 1;
            for (int i : mp.values()) {
                ret *= (i + 1);
            }
            System.out.println(ret - 1);
        }
    }
}
