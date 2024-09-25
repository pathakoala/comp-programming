#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >>t;

    for(int i = 0; i<t; i++) {
        int n;
        cin >> n;
        string str;
        cin >> str; 
        string streverse = str;
        reverse(streverse.begin(), streverse.end());
        if(str.compare(streverse) > 0) {
            string ans = streverse+str;
            cout << ans << "\n";
        } else {
            cout << str << "\n";
        }
       
        
    }
}