

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ret = 0;


        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            Deque<Character> stack = new ArrayDeque<>();

            for (int j = 0; j < s.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(arr[j]);
                }
                else if (stack.peek() == arr[j]) {
                    stack.pop();
                } else {
                    stack.push(arr[j]);
                }
            }

            if (stack.isEmpty()) {
                ret++;
            }
            
        }
        System.out.println(ret);
    }
}
