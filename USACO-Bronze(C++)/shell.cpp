#include <bits/stdc++.h>

using std::vector;

int main() {
    freopen("shell.in", "r", stdin);
    freopen("shell.out", "w", stdout);

    int n;
    scanf("%d", &n);

    vector<int> shellpos(3);
    for(int i = 0; i<3; i++) {
        shellpos[i] = i;
    }

    vector<int> count(3);
    for(int i = 0; i<n; i++) {
        int a, b, g;
        scanf("%d %d %d", &a, &b, &g);
        a--, b--, g--;
        
        std::swap(shellpos[a], shellpos[b]);
        
        count[shellpos[g]]++;
    }
    printf("%d", std::max({count[0], count[1], count[2]}));
}