#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

void solve() {
	int n;
	cin >> n;
	int a[n], b[n], c[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	for(int i=0; i<n; ++i)
		cin >> b[i];
	for(int i=0; i<n; ++i)
		cin >> c[i];
	int f=a[0];
	cout << f;
	int p=f;
	for(int i=1; i<n; ++i)
		for(auto x : {a[i], b[i], c[i]})
			if(x!=p&&x!=f) {
				p=x;
				cout << " " << x;
				break;	
			}
	cout << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
