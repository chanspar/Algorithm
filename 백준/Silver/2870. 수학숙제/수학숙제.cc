#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
#include <string>
#include <stack>
#include <queue>

using namespace std;
vector<string> v;

bool cmp(string a, string b) {
	if (a.size() == b.size()) {
		return a < b;
	}
	return a.size() < b.size();
}

int main() {
	int n;
	string s;

	cin >> n;
	while (n--) {
		int flag = 0;
		string tmp = "";
		cin >> s;
		
		for (char c : s) {
			if ('0' <= c && c <= '9') {
				if (tmp == "0") {
					tmp = c;
				} else {
					tmp = tmp + c;
				}
				flag = 1;
			} else if (flag == 1) {
				v.push_back(tmp);
				tmp = "";
				flag = 0;
			}
		}
		if (flag == 1) {
			v.push_back(tmp);
		}
	}
	sort(v.begin(), v.end(), cmp);

	for (auto a : v) {
		cout << a << "\n";
	}

}