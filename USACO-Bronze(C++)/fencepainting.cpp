#include <bits/stdc++.h>

typedef long long ll;
using namespace std;

int main() {
    freopen("paint.in", "r", stdin);
    freopen("paint.out", "w", stdout);

    int a;
    int b;
    int c;
    int d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int tot = 0;
    for(int i = 0; i<100; i++) {
        if(i>= a && i+1<=b) {
            tot++;
        } else if(i>=c && i+1<=d) {
            tot++;
        }
    } 
    printf("%d", tot);
}