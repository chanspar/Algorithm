#include <bits/stdc++.h>

using namespace std;

int n, m;
map<int, string> mp1;
map<string, int> mp2;
string s;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n >> m;
    for (int i = 1; i <= n; i++)
    {
        cin >> s;
        mp1[i] = s;
        mp2[s] = i;
    }
    for (int i = 1; i <= m; i++)
    {
        cin >> s;
        if (atoi(s.c_str()) == 0)
        {
            cout << mp2[s] << "\n";
        }
        else
        {
            cout << mp1[atoi(s.c_str())] << "\n";
        }
    }
    return 0;
}
