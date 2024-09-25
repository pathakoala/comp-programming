#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    for(int i = 0; i<t; i++) {
        int n, k;
        cin >> n >> k;
        if(k >= n-1) {
            cout << 1 << "\n";
        } else {
            cout << n << "\n";
        }
    }
}