#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int T;
	int sharp = 1;

	cin >> T;
	while (T--) {	
		int a[10];
		double ret = 0;
		for (int i = 0; i < 10; i++) {
			cin >> a[i];
			ret += a[i];
		}
		cout << "#" << sharp << " " << round(ret / 10) << "\n";
		sharp++;
	}
	return 0;
}