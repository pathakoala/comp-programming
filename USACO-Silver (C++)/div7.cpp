#include <bits/stdc++.h>

using namespace std;
#define sz(x) (int)size(x)


int main() {
   freopen("div7.in", "r", stdin);
   freopen("div7.out", "w", stdout);

   ios::sync_with_stdio(false);
   cin.tie(nullptr);

   int n;
   cin >> n;
   int first[7];
   for(int i = 0; i<7; i++){
    first[i] = INT_MAX;
   }
   int last[7];
   int cur = 0;
   for(int i = 1; i<= n; i++) {
        int x;
        cin >> x;
        cur += x;
        cur %= 7;
        first[cur] = min(first[cur], i);
        last[cur] =i;
   }

    int r = 0;
    for(int j = 0; j<7; j++) {
        if(first[j] < n) {
            r = max(r, last[j]-first[j]);
        }
    }
    cout << r;
}