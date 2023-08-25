#include <bits/stdc++.h>

using namespace std;

int n, m, cnt = 0;
int num[15001];
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    cin >> m;
    for(int i = 0; i < n; i++)
    {
        cin >> num[i];
    }
    for(int i=0; i<n; i++)
    {
        for (int j=i + 1; j<n; j++)
        {
            if (m == (num[i] + num[j]))
                cnt++;

        }
    }

    cout << cnt;
    return 0;

}
