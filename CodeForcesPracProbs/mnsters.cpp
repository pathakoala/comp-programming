#include <bits/stdc++.h>

using namespace std;
#define f first
#define s second

bool discomp(pair<int, int> p, pair<int, int> q) {return p.s < q.s;}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    for(int i = 0; i<t; i++) {
        int n, k;
        cin >> n >> k;
        cout << n << " " << k << "\n";
        vector<pair<int, int>> vec;
        for(int j = 0; j<n; k++) {
            int a;
            cin >> a;
            vec.push_back({a, 0});
            cout << a << " ";
        }
        cout << "\n";
        for(int j = 0; j<n; j++) {
            int x;
            cin >> x;
            vec[j].s = abs(x);
        }  

        sort(vec.begin(), vec.end(), discomp);

        vector<int> time(vec[n-1].s+1);
        int t = 0;
        for(int j = 0; j<n; j++) {
            t += vec[j].f;
            time[vec[j].s] += t;
        }

        for(int j = 1; j<=time.size(); j++) {
            if(time[j] == 0) {
                time[j] = time[j-1];
            }
        }

        vector<int> pos;
        for(int j = 0; j < time.size(); j++) {
            pos.push_back(j * k);
        }

        bool poss = true;
        for(int j = 0; j<time.size(); j++) {
            if(time[j] > pos[j]) {
                poss = false;
                break;
            }
        }

        if(poss) {
            cout << "YES" << "\n";
        } else {
            cout << "NO" << "\n";
        }

    }
}