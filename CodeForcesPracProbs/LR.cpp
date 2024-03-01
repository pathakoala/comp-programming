#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    for(int i = 0; i<t; i++) {
        int n, m;
        cin >> n >> m;
        int prod = 1;
        vector<int> vec;
        for(int j = 0; j<n; j++) {
            int x;
            cin >> x;
            vec.push_back(x);
            prod *= x;
        }

        string dir;
        cin >> dir;

        for(int j = 0; j<n; j++) {
            cout << prod%m << " ";
            if(dir[j] =='L') {
                prod /= vec[0];
                vec.erase(vec.begin());
            } else {
                prod /= vec[vec.size()-1];
                vec.erase(vec.end());
            }
        }
        if(i < n-1) {
        cout << "\n";
        }
    }
}