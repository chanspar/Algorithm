#include <bits/stdc++.h>
using namespace std;

int t=10, sharp = 1;
int n;
string s;
int main()
{
	while(t--){
		vector<string> v, v1;
		int cnt=0;
		cin >> n;
		for (int i=0; i<8; i++){
			cin >> s;
			v.push_back(s);
		}
		for (int i=0; i<8; i++){
			string a = "";
			for (int j=0; j<8; j++){
				a = a + v[j][i];
			}
			v1.push_back(a);
		}

		for (int i=0; i<8; i++){
			for (int j=0; j<8; j++){
				if (j+n <= 8){
					string tmp, tmp1;
					tmp = v[i].substr(j, n);
					tmp1 = v[i].substr(j, n);
					reverse(tmp1.begin(), tmp1.end());
					if (tmp == tmp1) cnt++;
					string tmp2, tmp3;
					tmp2 = v1[i].substr(j, n);
					tmp3 = v1[i].substr(j, n);
					reverse(tmp3.begin(), tmp3.end());
					if (tmp2 == tmp3) cnt++;
				}
			}
		}
		
		cout << "#" << sharp << " " << cnt << "\n";
		sharp++;
	} 
}