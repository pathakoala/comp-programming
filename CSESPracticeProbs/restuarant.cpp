#include <bits/stdc++.h>

using namespace std;

#define f first

#define s second

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<pair<int, int>> vec;

    for(int i = 0; i<n; i++) {
        int a, b;
        cin >> a >> b;
        vec.push_back({a, i});
        vec.push_back({b, i});
    }
    sort(vec.begin(), vec.end());
    vector<int> v(2*n);
    for(int i = 0; i<2*n; i++) {
        v[i] = vec[i].s;
    }
    int maxi = 1;
    vector<int> curcount(2*n);
    vector<int> cur(n);
    for(int i = 0; i<2*n-1; i++) {
        cur[v[i]]++;
        if(i != 0) {
        if(cur[v[i]] != 2) {
            curcount[i] = curcount[i-1] + 1;
        } else {
            curcount[i] = curcount[i-1] - 1;
        }
        } else {
            curcount[0] = 1;
        }
    }
    for(int i = 0; i<2*n; i++) {
        maxi = max(maxi, curcount[i]);
    }

    cout << maxi;

}