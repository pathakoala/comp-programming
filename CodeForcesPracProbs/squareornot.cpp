#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    for(int i = 0; i<t; i++) {
        int n;
        cin >> n;
        string x;
        cin >> x;
        int s = sqrt(n);
        if(s*s == n) {
            string ss = "";
            for(int j = 0; j<n; j++) {
                ss += "1";
            }
            for(int k = 0; k<s-2; k++) {
            ss+="1";
            for(int j = 0; j<s-2; j++) {
                ss+="0";
            }
            ss+="1";
            }
            for(int j = 0; j<n; j++) {
                ss += "1";
            }
            if(ss == x) {
                cout << "YES" << "\n";
            } else {
                cout << "NO" << "\n";
            }

        } else {
            cout << "NO" << "\n";
        }
    }
}

