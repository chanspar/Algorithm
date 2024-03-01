#include <iostream>
using namespace std;

int k = 0;

void hanoiCnt(int n, int a, int b, int c)
{
	if (n == 1) {
		k++;
	}
	else {
		hanoiCnt(n - 1, a, c, b);
		k++;
		hanoiCnt (n - 1, b, a, c);
	}
}

void hanoiRecursion(int n, int a, int b, int c)
{
	if (n == 1) {
		cout << a << " " << c << "\n";
	}
	else {
		hanoiRecursion(n - 1, a, c, b);
		cout << a << " " << c << "\n";
		hanoiRecursion(n - 1, b, a, c);
	}
}

int main()
{
	int n;
	
	cin >> n;
	hanoiCnt(n, 1, 2, 3);
	cout << k << "\n";
	hanoiRecursion(n, 1, 2, 3);
	
	return 0;
}