#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str; 
    cin >> str; 
    int ints[str.length()];
    for(int i = 0; i<str.length(); i++) {
        ints[i] = str[i] - '0';
        if(ints[i] >= 5) {
            ints[i] = 9-ints[i];
        }
        cout << ints[i];
    }
        
}