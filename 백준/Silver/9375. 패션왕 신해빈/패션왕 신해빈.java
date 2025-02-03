
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
                if (mp.get(s) == null) {
                    mp.put(s, 1);
                } else {
                    int a = mp.get(s); 
                    mp.put(s, ++a);
                }
            }

            int ret = 1;
            for (int i : mp.values()) {
                ret = ret * (i + 1);
            }
            System.out.println(ret - 1);
            
        }
    }
}
