

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<Pair> arr = new ArrayList<>();        

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            arr.add(new Pair(a, s));
        }


        arr.sort((a, b) -> a.a - b.a);

        for (Pair pair : arr) {
            System.out.println(pair.a + " " + pair.s);
        }
        
    }

    static class Pair {
        Integer a;
        String s;

        public Pair(Integer a, String s) {
            this.a = a;
            this.s = s;
        }
    }
}
