#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int x, stick = 64, cnt = 0, stick_length = 0;
	cin >> x;
	while (stick_length != x)
	{
		if (x == 64)
		{
			cnt++;
			break;
		}
		else if (stick_length > x)
		{
			stick_length -= stick;
			cnt--;
		}
		stick /= 2;
		if (stick <= x)
		{
			stick_length += stick;
			cnt++;
		}
	}
	cout << cnt;
	
	return 0;
}