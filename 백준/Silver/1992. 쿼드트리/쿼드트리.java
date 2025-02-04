

import java.util.*;
import java.io.*;


public class Main {
    static int n;
    static char[][] a;

    public static String quard(int y, int x, int size) {
        if (size == 1) {
            return String.valueOf(a[y][x]);
        }
        char b = a[y][x];
        // 현재 영역이 모두 같은 문자로 이루어졌는지 판단
        boolean same = true;
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (a[i][j] != b) {
                    same = false;
                    break;
                }
            }
            if (!same) {
                break;
            }
        }
        if (same) {
            return String.valueOf(b);
        }
        
        // 영역 내에 서로 다른 문자가 존재하면 분할 정복 처리
        String ret = "(";
        ret += quard(y, x, size / 2);                  // 좌상
        ret += quard(y, x + size / 2, size / 2);         // 우상
        ret += quard(y + size / 2, x, size / 2);         // 좌하
        ret += quard(y + size / 2, x + size / 2, size / 2); // 우하
        ret += ")";
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new char[n][n];
        
        // 각 행의 문자열을 입력받아 char 배열에 저장
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        
        System.out.println(quard(0, 0, n));
        sc.close();
    }

}
