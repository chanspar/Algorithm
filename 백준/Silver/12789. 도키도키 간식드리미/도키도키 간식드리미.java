

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int order = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> stack = new ArrayDeque<>();

        int size;
        for (int i = 0; i < n; i++) {
            if (order == arr[i]) {
                order++;
            } else {
                stack.push(arr[i]);
            }
            size = stack.size();
            for (int j = 0; j < size; j++) {
                if (order == stack.peek()) {
                    order++;
                    stack.pop();
                }
                else {
                    break;
                }
            } 
            
        }

        if (stack.size() == 0) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
