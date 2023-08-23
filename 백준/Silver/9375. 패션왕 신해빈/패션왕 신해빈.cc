#include <bits/stdc++.h>

using namespace std;

int t, n;
string a,b;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> t;
    while (t--) {
        map<string, int> mp;
        cin >> n;
        for (int i = 0; i < n; i++) {
            cin >> a >> b;
            mp[b]++;
        }
        int ret = 1;
        for (auto a: mp) {
            ret *= (a.second + 1);
        }
        ret--;
        cout << ret << "\n";
    }
    return 0;

}
