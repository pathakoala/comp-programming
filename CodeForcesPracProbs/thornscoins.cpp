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
        string str;
        cin >> str;
        int ccount = 0;
        for(int j = 0; j<n; j++) {
            if(str[j] == '@') {
                ccount++;
            }
            if(str[j] == '*' && str[j+1] == '*') {
                break;
            }
        }

        cout << ccount << "\n";
    }
}