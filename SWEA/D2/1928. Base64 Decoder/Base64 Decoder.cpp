#include <iostream>
#include <string>
using namespace std;
int t;
string s;

int c_i(char c) {
	if (c >= 'A' && c <= 'Z') {
		return (c - 'A');
	}
	else if (c >= 'a' && c <= 'z') {
		return (c - 'a' + 26);
	}
	else if (c >= '0' && c <= '9') {
		return (c - '0' + 52);
	}
	else if (c == '+') {
		return 62;
	}
	else if (c == '/') {
		return 63;
	}
}

int main() {
	int sharp = 1;
	cin >> t;
	while (t--) {
		int flag = 0, tmp;
		cin >> s;
		cout << "#" << sharp << " ";
		sharp++;
		for (int i = 0; i < s.size() - 1; i++) {
			char c1, c2;
			int i1, i2;
			c1 = s[i];
			c2 = s[i + 1];
			i1 = c_i(c1);
			i2 = c_i(c2);
			if (flag == 0) {
				tmp = i1 << 2;
				tmp += i2 >> 4;
				cout << char(tmp);
				flag++;
			}
			else if (flag == 1){
				tmp = i1 << 4;
				tmp += i2 >> 2;
				cout << char(tmp);
				flag++;
			}
			else if (flag == 2) {
				tmp = i1 << 6;
				tmp += i2;
				cout << char(tmp);
				flag = 0;
				i++;
			}
		}
		cout << "\n";
	}

	return 0;
}