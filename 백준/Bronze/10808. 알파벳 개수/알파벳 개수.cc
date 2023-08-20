#include <bits/stdc++.h>
using namespace std;
string s;
int alp[26];
int main() 
{
	int i = 0;
	cin >> s;
	
	while (i < s.size())
	{
		alp[s[i] - 'a']++;
		i++;
	}
	
	for(int i = 0; i < 26; i++)
		cout << alp[i] << " ";
	
	return 0;
}