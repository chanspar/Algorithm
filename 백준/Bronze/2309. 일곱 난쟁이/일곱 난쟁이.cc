#include <bits/stdc++.h>
using namespace std;
int arr[9];

int main() 
{
	for(int i = 0; i < 9; i++)
		cin >> arr[i];
	
	sort(arr, arr+9);
	do
	{
		if (accumulate(arr, arr+7, 0) == 100)
			break ;
	}while(next_permutation(arr, arr+9));
	for(int i=0; i<7; i++)
		cout << arr[i] << '\n';
	return 0;
}