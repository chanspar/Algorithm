#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
#include <string>
#include <stack>
#include <queue>
#include <math.h>
#include <list>
using namespace std;

int main() {
    int n;
    queue<int> q;

    cin >> n;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    while (q.size() != 1) {
        int tmp;
        q.pop();
        tmp = q.front();
        q.pop();
        q.push(tmp);
    }
    cout << q.front() << "\n";

}