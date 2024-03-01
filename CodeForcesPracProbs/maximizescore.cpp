#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    for(int i = 0; i < t; i++) {
        int n;
        cin >> n;
        vector<int> ints(2*n);
        for(int j = 0; j<2*n; j++) {
            int x;
            cin >> x;
            ints[j] = x;
        }
        sort(ints.begin(), ints.end());
        long long total = 0;
        for(int j = 0; j<2*n-1; j+=2) {
            total += ints[j];
        }
        cout << total << "\n";
    }
}