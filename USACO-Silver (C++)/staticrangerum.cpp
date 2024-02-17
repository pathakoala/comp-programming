#include <bits/stdc++.h>
using namespace std;

#define sz(x) (int)size(x)

using ll = long long;
using vll = vector<ll>;

vll psum(const vll &a) {
    vll psum(sz(a)+1);
    for(int i = 0; i< sz(a); i++) psum[i+1] = psum[i]+a[i];

    return psum;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, q;
    cin >> n >> q;
    vll a(n);
    for(ll &x : a) cin >> x;
    vll p = psum(a);
    for(int i = 0; i<q; i++) {
        int l, r;
        cin >> l >> r;
        cout << p[r] - p[l] << "\n";
    }
}