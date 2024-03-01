#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    for(int i = 0; i<n; i++) {
        string str;
        cin >> str;
        int ac = 0;
        int bc = 0;
        for(int j = 0; j<5; j++) {
            if(str[j] == 'A') ac++;
            if(str[j] == 'B') bc++;
        }
        if(ac > bc) {
            cout << 'A' << "\n";
        } else {
            cout << 'B' << "\n";
        }
    }
}