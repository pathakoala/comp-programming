#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

bool possible(int n, vector<int> v) {
    vector<bool> boolvec;
    for(int i = 0; i<n-2; i++) {
        int a = v[i];
        int b = v[i+1];
        int c = v[i+2];
        bool t1;
        bool t2;
        if(a != b && a % b == 0) {
            t1 = true;
        } else {
            t1 = false;
        }
        if(c != b && c % b == 0) {
            t2 = true;
        } else {
            t2 = false;
        }
        if(t1&&t2) {
            boolvec.push_back(true);
        } else {
            boolvec.push_back(false);
        }
    }

    bool truth = true;
    for(int i= 0; i<n-1; i++) {
        if(boolvec[i]) {
            truth = true;
        }
    }
    if(truth) {
        return false;
    } else {
        return true; 
    }
}

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
            cin >> a; 
            vec.push_back(a);
        }

        bool pos;
        if(n>2) {
            pos = possible(n, vec);
        } else {
            pos = true;
        }
        if(pos) {
            cout << "YES" << "\n";
        } else {
            cout << "NO" << "\n";
        }
    }
}