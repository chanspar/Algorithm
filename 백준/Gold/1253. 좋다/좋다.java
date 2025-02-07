import java.util.*;

public class Main {
	static int n;
	static Integer[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int ret = 0;
		for (int i = 0; i < n; i++) {
			int l = 0;
			int r = n - 1;
			while (l < r) {
				if (l == i) {
					l++;
					continue;
				}
				if (r == i) {
					r--;
					continue;
				}
				int sum = a[l] + a[r];
				if (a[i] == sum) {
					ret++;
					break;
				}
				if (sum > a[i]) {
					r--;
				} else {
					l++;
				}
			}
		}
		System.out.println(ret);
	}
}
