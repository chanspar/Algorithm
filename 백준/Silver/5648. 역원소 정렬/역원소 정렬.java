

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Long> li = new ArrayList<>();

        while (li.size() < n) {
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                StringBuilder sb = new StringBuilder(s);
                long a = Long.parseLong(sb.reverse().toString());
                li.add(a);
            }
            if (li.size() == n) break;
            st = new StringTokenizer(br.readLine());
        }

        li.sort((a,b) -> a.compareTo(b));

        for (long i : li) {
            System.out.println(i);
        }
        
        
    }
}
