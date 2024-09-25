#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, el;
    cin >> n >> el;
    vector<int> nums;
    for(int i = 0; i<n;i++) {
        int x;
        cin >> x;
        nums.push_back(x); 
    }

    sort(nums.begin(), nums.end());
    priority_queue<int> pq;
    vector<int> num;
    for(int i = 0; i<nums[nums.size()-1]; i++) {
        num = nums;
        int in = 0;
        for(int j = i-1; j>=0; j--) {
            in++;
            if(in > el) {
                break;
            }
            num[j]++;
        }
        int index = i;
        if(i <= nums[nums.size()-1-i]){
            pq.push(i);
        }
        num.clear();
    }

    cout << pq.top();
}