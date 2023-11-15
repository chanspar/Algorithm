#include <bits/stdc++.h>
using namespace std;

priority_queue<double> pq; //내림차순
vector<double> v;
int main(){
	int n;
	double tmp;

	cin >> n; //8~천만
	for (int i=0; i<n; i++){
		cin >> tmp;
		if (pq.size() == 7){
			pq.push(tmp); pq.pop();
		}
		else
			pq.push(tmp);
	}
	while (pq.size()){
		v.push_back(pq.top());
		pq.pop();
	}
	reverse(v.begin(), v.end());
	for (auto i : v) printf("%.3lf\n", i);

	return 0;
}