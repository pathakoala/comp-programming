#include <bits/stdc++.h>

using namespace std;

int main() {
    freopen("maxcross.in", "r", stdin);
    freopen("maxcross.out", "w", stdout);
    
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k, b;
    cin >> n >> k >> b;
    vector<int> walks(n);
    for(int i = 0; i<b; i++) {
        int x;
        cin >> x;
        walks[x-1] = 1;
    }

    vector<int> psum(n+1);
    for(int i = 0; i<n; i++) {
        psum[i+1] = psum[i] + walks[i+1];
    }
  ;
    int mini = INT_MAX;
    for(int i = 0; i<n-k; i++) {
        mini = min(mini, psum[i+k]-psum[i]);
    }
 
    cout << mini;
    
}