#include <bits/stdc++.h>
using namespace std;

int main() {
    freopen("bcount.in", "r", stdin);
    freopen("bcount.out", "w", stdout);

    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, q;
    cin >> n >> q;
    int psum[4][n+1];
    for(int i = 1; i<=n; i++){
        int curr;
        cin >> curr;
        for(int j = 1; j<=3; j++) {
            psum[j][i] = psum[j][i-1];
        }
        psum[curr][i]++;
    }

    for(int i = 0; i<q; i++) {
        int a, b;
        cin >> a >>b;
        cout << psum[1][b] - psum[1][a-1] << " " << psum[2][b] - psum[2][a-1] << " " << psum[3][b] - psum[3][a-1] << "\n";
    }
}