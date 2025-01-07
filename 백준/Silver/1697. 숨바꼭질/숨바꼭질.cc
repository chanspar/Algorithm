#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
#include <string>
#include <stack>
#include <queue>
#include <deque>
using namespace std;


int n, k;
int ret[100005];
int dx[] = {2, 1, -1};
int main() {
    cin >> n >> k;
    if (n == k) {
        cout << "0\n";
        return 0;
    }
    memset(ret, 0, sizeof(ret));

    queue<int> q;
    q.push(n);
    ret[n] = 1;
    while (!q.empty()) {
        int pos = q.front(); q.pop();
        for(int i = 0; i < 3; i++) {
            int nx;
            if (i == 0) {
                nx = pos * 2;
            }
            else {
                nx = pos + dx[i];
            }
            if (nx < 0 || nx > 100000 || ret[nx]) continue;
            if (nx == k) {
                cout << ret[pos] << "\n";
                return 0;
            }
            q.push(nx);
            ret[nx] = ret[pos] + 1;

        }
    }
}