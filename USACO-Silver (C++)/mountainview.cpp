#include <bits/stdc++.h>

using namespace std;
#define f first
#define s second

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    freopen("mountains.in", "r", stdin);
    freopen("mountains.out", "w", stdout);

    int n;
    cin >> n;
    vector<pair<pair<int, int>, int>> cords;

    for(int i = 0 ;i<n; i++)  {
        int x, y;
        cin >> x >> y;
        cords.push_back({{x, y}, 0});
    }

    for(int i = 0; i<n; i++) {
        for(int j = i+1; j<n; j++) {
            if((cords[i].f.s - cords[j].f.s)/(cords[i].f.f - cords[i].f.f) > 1 && (cords[i].f.s - cords[j].f.s)/(cords[i].f.f - cords[i].f.f) < -1 ) {
                if(cords[i].f.s > cords[j].f.s) {
                    cords[i].s ++;
                } else {
                    cords[j].s++;
                }
            }
        }
    }

    int vis = 0;
    for(int i = 0; i<n; i++) {
        if(cords[i].s = 0) {
            vis++;
        }
    }

    cout << vis << "\n";
}