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
        vector<int> vec;
        for(int j = 0; j<n; j++) {
            int a;
            cin>>a;
            vec.push_back(a);
        }
        sort(vec.begin(), vec.end());
        int sum = 0;
        for(int j = 1; j<n; j++) {
            sum += vec[j] - vec[j-1];
        }
        cout << sum << "\n";
    }
}