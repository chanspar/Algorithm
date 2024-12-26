

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // (a - b) * day + b >= v
        int day = (v - b) / (a - b);
        // 나머지가 있으면 하루 더 걸림
        if ((v - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
