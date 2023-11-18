#include <bits/stdc++.h>
using namespace std;

int t=10, sharp =1, t_case, num;

int main(){
	while (t--){
		vector<int> v;
		int minus = 1;
		cin >> t_case;
		for (int i=0; i<8; i++){
			cin >> num;
			v.push_back(num);
		}
		while (1){
			if (minus == 6){
				minus = 1;
			}
			v[0] -= minus;
			minus++;
			rotate(v.begin(), v.begin() + 1, v.end());
			if (v[7] <= 0){
				v[7] = 0;
				break;
			}
		}
		cout << "#" << t_case << " ";
		for(int i : v){
			cout << i << " ";
		}
		cout << "\n";

	}
	return 0;
}