#include <iostream>
#include <algorithm>
using namespace std;

int a[1001];

int main() {
	int t, t_num;
	cin >> t;
	for (int i = 0; i < t; i++) {
		int max_num = -1, num;
		fill(a, a + 1000, 0);
		cin >> t_num;
		for (int j = 0; j < 1000; j++) {
			cin >> a[j];
		}
		sort(a, a + 1000);
		int s, cnt =1;
		s = a[0];
		num = a[0];
		for (int j = 1; j < 1000; j++) {
			if (s == a[j]) {
				cnt++;
			}
			else {
				s = a[j];
				cnt = 1;
			}
			if (max_num <= cnt) {
				max_num = cnt;
				num = a[j];
			}
		}

		cout << "#" << t_num << " " << num << "\n";
	}
	return 0;
}