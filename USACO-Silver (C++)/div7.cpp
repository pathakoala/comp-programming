#include <bits/stdc++.h>

using namespace std;
#define sz(x) (int)size(x)

vector<int> psum(const vector<int> &a) {
    vector<int> psum(sz(a)+1);
    for(int i = 0; i<sz(a); i++) {
        psum[i+1] = psum[i] + a[i];
    }

    return psum;
}

int main() {
   

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<int> vec;
    for(int i = 0; i<n; i++) {
        int x;
        cin >> x;
        vec.push_back(x);
    }

    vector<int> pre = psum(vec);
    int max = 0;
    for(int i = n; i> 0; i++) {
        for(int j = 0; j<n-i+1; j++) {
            if((pre[j+i-1] - pre[j-1]) % 7 == 0) {
                max = i;
                break;
            }
        }
    }

        cout << max;
    
}