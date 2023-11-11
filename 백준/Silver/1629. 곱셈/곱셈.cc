#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
//시간제한 0.5초 정도 O(N)이 5천만정도로 
//A^B / C를 구하시오 보통방법이면 최악의 경우 21억번 곱해야됨

ll a, b, c;
ll go(ll a, ll b){
	if (b == 1) return a % c;

	ll ret = go(a, b/2);
	ret = (ret * ret) % c;
	if (b % 2) ret = (ret * a) % c;
	return ret;
}

int main(){
	cin >> a >> b >> c; 
	cout << go(a, b);


	return 0;
}