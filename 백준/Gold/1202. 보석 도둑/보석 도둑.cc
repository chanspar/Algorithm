#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n, k, ret;

int main(){
	// ios_base::sync_with_stdio(false);
	// cin.tie(NULL);
	// cout.tie(NULL);

	cin >> n >> k; //보석 가방 
	vector<pair<ll, ll>> v(n); //보석 무게 가격
	vector<ll> vv(k); //가방 최대무게
	
	for(int i=0; i<n; i++){
		cin >> v[i].first >> v[i].second;
	}
	for (int i=0; i<k; i++) cin >> vv[i];
	sort(v.begin(), v.end());
	sort(vv.begin(), vv.end());
	priority_queue<ll> pq;

	int j = 0;
	for (int i=0; i<k; i++){
		while (j < n && vv[i] >= v[j].first){
			pq.push(v[j++].second);
		}
		if (pq.size()) {
			ret += pq.top(); pq.pop();
		}

	}
	cout << ret << '\n';

	return 0;
}