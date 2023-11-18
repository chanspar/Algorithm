#include <iostream>
using namespace std;


int t = 10, t_num;
int a[100][100];

int main(void)
{
	while (t--) {
		int sum, max = -214748364;

		cin >> t_num;
		fill(&a[0][0], &a[99][100], 0);
		for (int i = 0; i < 100; i++) {
			sum = 0;
			for (int j = 0; j < 100; j++) {
				cin >> a[i][j];
				sum += a[i][j];
			}
			if (max < sum)
				max = sum;
		}
		for (int i = 0; i < 100; i++) {
			sum = 0;
			for (int j = 0; j < 100; j++) {
				sum += a[j][i];
			}
			if (max < sum)
				max = sum;
		}
		sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += a[i][i];
		}
		if (max < sum)
			max = sum;
		sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += a[i][99 - i];
		}
		if (max < sum)
			max = sum;

		cout << "#" << t_num << " " << max << "\n";
	}
	
	return 0;
}
