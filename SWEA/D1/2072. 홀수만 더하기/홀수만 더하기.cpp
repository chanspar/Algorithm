#include <iostream>
using namespace std;

int main()
{
	int T;
	int sharp = 1;

	cin >> T;
	while (T--) {	
		int a[10], ret=0;
		for (int i = 0; i < 10; i++) {
			cin >> a[i];
			if (a[i] % 2) ret += a[i];
		}
		cout << "#" << sharp << " " << ret << "\n";
		sharp++;
	}
	return 0;
}