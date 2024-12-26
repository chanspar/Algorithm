
import java.io.*;
import java.util.*;

// 소의 위치를 n번 관찰
// 소는 10마리    소의 번호(1~10) + 위치(0,1)로 이루어짐
// 같은 번호의 소가 몇번 와리가리 한지 세면 됨 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[11];


        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (arr[a] == 0) {
                arr[a] = b + 1;
            } else if (arr[a] != b + 1) {
                cnt++;
                arr[a] = b + 1;
            }
        }
        System.out.println(cnt);
    }
    
}
