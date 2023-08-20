#include <bits/stdc++.h>
using namespace std;

int truck[101];
int main() 
{
	int a, b, c, fee = 0;
	cin >> a >> b >> c;
	int t1, t2;
	for (int i=0; i<3; i++)
	{
		cin >> t1 >> t2;
		for(int j=t1; j <t2; j++)
		{
			truck[j]++;
		}
	}
	
	for(int i=1; i<=100;i++)
	{
		if (truck[i] == 1)
			fee += a;
		else if (truck[i] == 2)
			fee += (b * 2);
		else if (truck[i] == 3)
			fee += (c * 3);
	}
	cout << fee;
	return 0;
}