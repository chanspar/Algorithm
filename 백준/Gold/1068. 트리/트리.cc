#include<iostream>
#include<vector>
using namespace std;

vector<int> adj[51];
int n, tmp, root, del;

int dfs(int here){
	int ret = 0;
	int child = 0;
	for (int there : adj[here]){
		if (there == del) continue;
		ret += dfs(there);
		child++;
	}
	if (child == 0) return 1;
	return ret;
}

int main()
{
	cin >> n;

	for (int i=0; i<n;i++){
		cin >> tmp;
		if (tmp == -1) root = i;
		else adj[tmp].push_back(i);
	}
	cin >> del;
	if (del == root){
		cout << 0 << "\n";
		return 0;
	}
	cout << dfs(root) << "\n";
	return 0;
}
