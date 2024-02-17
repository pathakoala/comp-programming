#include <bits/stdc++.h>

using namespace std;

int main() {    
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    freopen("sleepy.in", "r", stdin);
    freopen("sleepy.out", "w", stdout);
    int t;
    cin >> t;
    int nums[t]; 
    for(int i = 0 ;i <t; i++) {
        cin >> nums[i];
    }
    int numc;
    for(int i = 0; i<t-1; i++) {
        if(nums[i] > nums[i-1]) {
            numc = i + 1;
        }
    }
    cout << numc;
}