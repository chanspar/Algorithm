#include<bits/stdc++.h>
using namespace std;

string s;
int a[26];
char s1[51];
int main()
{
	int len = 0;
	int cnt = 0;
	int idx = 0;
	cin >> s;
	len = s.size();
	for(char i : s) a[i-'A']++;

	//홀수가 두개이상일경우 오류 
	for(int i =0; i < 26; i++){
		if (a[i] % 2 == 1){
			s1[len / 2] = char(i + 'A');
			cnt++;
			a[i]--;
		}
		while (a[i]){
			s1[idx] = 'A' + i;
			s1[(len - 1) - idx] = 'A' + i;
			a[i] -= 2;
			idx++;
		}
		if (cnt > 1){
			cout << "I'm Sorry Hansoo";
			return 0;
		}
	}
	cout << s1;
	return 0;
}