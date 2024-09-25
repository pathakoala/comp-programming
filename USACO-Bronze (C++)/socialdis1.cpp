#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    freopen("socdist1.in", "r", stdin);
    freopen("socdist1.out", "w", stdout);

    int n;
    cin >> n;   
    string str;
    cin >> str; 
    vector<int> gaps;
    if(str[0] == '0') {
        gaps.push_back(-1);
    }
    int count = 0;
    for(int i = 0; i<n; i++) {
        if(str[i] == '1') {
            gaps.push_back(i);
            count = 0;
        }
    }
    if(str[n-1] == '0') {
        gaps.push_back(n);
    }
    vector<int> gapper;
    for(int i = 0; i<gaps.size()-1; i++) {
        gapper.push_back(gaps[i+1]-gaps[i]);
    }
    sort(gapper.begin(), gapper.end());
    cout<< min(gapper[0], min(gapper[gapper.size()-1]/2, gapper[gapper.size()-2]));
    

}