#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, m;
    map<string, int> mp1;
    map<int, string> mp2;
    // string a[100004];
    string s;

    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        cin >> s;
        mp1.insert({s, i});
        mp2.insert({i, s});
        // a[i] = s;
    }

    for (int i = 0; i < m; i++) {
        cin >> s;
        if (mp1.find(s) != mp1.end()) {
            cout << mp1[s] << "\n";
        } else {
            cout << mp2[atoi(s.c_str())] << "\n";
        }
    }




    return 0;
}
