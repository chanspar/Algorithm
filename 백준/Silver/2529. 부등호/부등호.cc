#include <bits/stdc++.h>
using namespace std;

int k, visited[10];
char a[12];
vector<string> ret;
//부등호 체크        10! 360만 정도 
//쓴 숫자 체크
//최대 최소

bool good(char x, char y, char op) {
	if (x < y && op == '<') return true;
	if (x > y && op == '>') return true;
	return false;
}

void go(int idx, string num) {
	if (idx == k + 1) {
		ret.push_back(num);
	}
	for (int i = 0; i < 10; i++) {
		if (visited[i]) continue;
		if (idx == 0 || good(num[idx - 1], i + '0', a[idx - 1])) {			
			visited[i] = 1;
			go(idx + 1, num + to_string(i));
			visited[i] = 0;
		}
	}
}

int main() {
	cin >> k;
	
	for(int i =0; i<k; i++) cin >> a[i];
	go(0, "");
	sort(ret.begin(), ret.end());
	cout << ret[ret.size() -1] << "\n" << ret[0] << "\n";
	

	





}