#include <bits/stdc++.h>

using namespace std;

using ll = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<ll> nums;
    for(int i = 0; i<n; i++){ 
        ll a;
        cin >> a;
        nums.push_back(a);
    }
    vector<ll> psum(n+1);
    for(int i = 1; i<=n; i++) {
        psum[i] = psum[i-1] + nums[i-1];
    }

    ll maxi = psum[1];
    ll mini = psum[0];
    for(int i = 1; i<=n; i++) {
        maxi = max(maxi, psum[i] - mini);
        mini = min(mini, psum[i]);
    }
    cout << maxi;
}