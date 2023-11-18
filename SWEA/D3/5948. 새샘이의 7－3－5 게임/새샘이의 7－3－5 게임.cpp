#include <bits/stdc++.h>
using namespace std;


int t, sharp =1;
int main(){
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> t;

	while (t--){
		int num, sum;
		vector<int> v, v1;

		for(int i=0; i<7; i++){
			cin >> num;
			v.push_back(num);
		}
		
		for (int i=0; i<7; i++){
			for (int j=i+1; j<7; j++){
				for (int k=j+1; k<7; k++){
					sum = v[i] + v[j] + v[k];
					v1.push_back(sum);
				}
			}
		}

		sort(v1.begin(), v1.end(), greater<int>());
		v1.erase(unique(v1.begin(),v1.end()),v1.end());

		cout << "#" << sharp << " " << v1[4] << "\n";
		sharp++;
	}


	return 0;
}