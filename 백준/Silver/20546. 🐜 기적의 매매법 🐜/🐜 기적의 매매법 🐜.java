

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[14];
        for (int i = 0; i < 14; i++) {
            arr[i] = scanner.nextInt();
        }

        int buy1 = 0;
        int ret1 = 0;
        int cpN1 = n;

        for (int i = 0; i < 14; i++) {
            if (cpN1 >= arr[i]) {
                buy1 += cpN1 / arr[i];
                cpN1 -= (cpN1 / arr[i]) * arr[i];
            }
        }
        ret1 = cpN1 + buy1 * arr[13];


        int buy2 = 0;
        int ret2 = 0;
        int cpN2 = n;
        int asc = 0;
        int desc = 0;
        int temp = arr[0];
        for (int i = 1; i < 14; i++) {
            if (temp < arr[i]) {
                asc++;
                desc = 0;
            } else if (temp > arr[i]) {
                desc++;
                asc = 0;
            } else {
                asc = 0;
                desc = 0;
            }
            if (asc == 3) {
                cpN2 = cpN2 + buy2 * arr[i];
                buy2 = 0;
                asc = 0;
            } else if (desc >= 3) {
                buy2 += cpN2 / arr[i];
                cpN2 -= (cpN2 / arr[i]) * arr[i];
            }
            temp = arr[i];
        }
        ret2 = cpN2 + buy2 * arr[13];

        if (ret1 > ret2) {
            System.out.println("BNP");
        } else if (ret1 < ret2) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
