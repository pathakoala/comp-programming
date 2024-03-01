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
        int j = 0;
        bool done = true;
        while(done) {
            j++;
            if(pow(2, j) > n) {
                j -= 1;
                done = false;
            }
        }
        j = pow(2, j);
        cout << j << "\n";
    }
}