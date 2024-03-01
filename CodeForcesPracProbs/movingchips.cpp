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
        int f1;
        int l1;
        vector<int> vec;
        for(int i = 0; i<n; i++) {
            int x;
            cin >> x;
            vec.push_back(x);
        }
        for(int i = 0; i<n; i++) {
            if(vec[i] == 1) {
                f1 = i;
                break;
            }
        }
        for(int i = n-1; i>=0; i--) {
            if(vec[i] == 1) {
                l1 = i;
                break;
            }
        }

        int gap = 0;
        for(int i = f1+1; i<l1; i++) {
            if(vec[i] == 0) {
                gap++;
            }
        }

        cout << gap << "\n";
    }
}