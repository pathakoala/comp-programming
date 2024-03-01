#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    vector<int> sums(10);
    for(int i = 1; i<10; i++) {
        sums[i] = sums[i-1] + i;
    }

    int t;
    cin >> t;
    for(int i = 0; i<t; i++) {
        int n;
        cin >> n;
        vector<int> digs(6);
        int ten0 = n % 10;
        int ten1 = n/10;
        int ten2 = n/100;
        int ten3 = n/1000;
        int ten4 = n/10000;
        int ten5 = n/100000;

        int fin = ten1 * 45 + 10*ten2 + 100*ten3 + ten4*1000 + ten5*10000 + ((ten0+1) * (ten1 + ten2 + ten3 + ten4 + ten5) * digs[ten0]);
        cout << fin;

    }
}