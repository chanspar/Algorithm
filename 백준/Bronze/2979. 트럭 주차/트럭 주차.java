

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] park = new int[102];
        int ret = 0;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            for (int j = s; j < e; j++) {
                park[j]++;
            }
        }

        for (int i = 0; i < 102; i++) {
            if (park[i] == 1) {
                ret += a;
            } else if (park[i] == 2) {
                ret += b * 2;
            } else if (park[i] == 3) {
                ret += c * 3;
            }
        }
        System.out.println(ret);
    }
    

}
