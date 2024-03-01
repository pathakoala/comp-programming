#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    for(int i = 0; i<t; i++) {
        int n; 
        cin >> n;
        int sign;
        cin >> sign;
        for(int j = 1; j<n; j++) {
            int nextsign;
            cin >> nextsign;
            if(nextsign<= sign) {
                int a = sign/nextsign;
                a += 1;
                sign = nextsign*a;
            } else {
                sign = nextsign;
            }
        }
        cout << sign << "\n";
    }
}