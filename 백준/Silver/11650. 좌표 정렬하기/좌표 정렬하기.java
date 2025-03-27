

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Point> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new Point(x, y));
        }

        arr.sort((a, b) -> {
            if (a.x == b.x) {
                return a.y - b.y;
            } else {
                return a.x - b.x;
            }
        });

        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }


    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.y = y;
            this.x = x;
        }
    }
    
}
