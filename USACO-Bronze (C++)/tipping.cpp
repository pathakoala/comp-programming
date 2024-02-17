#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t; 
    char tips[t][t];
    for(int i = 0; i<t; i++) {
        string str;
        cin >> str;
        for(int j = 0; j<t; j++) {
            tips[i][j] = str[j];
        }
    }

    int count  = 0;
    for(int i = t-1; i>= 0; i--) {
        for(int j = t-1; j >= 0; j--) {
            if(tips[i][j] == '1') {
                count++;
                for(int k = i; k>= 0; k--) {
                    for(int l = j; l >= 0; l--) {
                        if(tips[k][l] == '1') {
                            tips[k][l] = '0';
                        } else {
                            tips[k][l] = '1';
                        }
                    }
                }
            }
        }
    }
    cout << count << endl;
}