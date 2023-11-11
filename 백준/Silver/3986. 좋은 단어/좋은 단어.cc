#include <bits/stdc++.h>
using namespace std;

int n;
string s;
int cnt;
int main(){
	cin >> n;
	for (int i=0; i<n; i++){
		cin >> s;
		stack<char> stk;
		for (char a : s){
			if(stk.size() && stk.top() == a){
				stk.pop();
			}
			else stk.push(a);
		}
		if (stk.size() == 0) cnt++;
	}
	cout << cnt;
	return 0;
}