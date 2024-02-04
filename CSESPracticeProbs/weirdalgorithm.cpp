#include <bits/stdc++.h>

using namespace std;

int main() {
    long long in;
    scanf("%lld", &in);

    printf("%lld ", in);
    while(in != 1) {
        if(in %2 == 0) {
            in /= 2;
        } else {
            in  = 3*in +1;
        }
        printf("%lld ", in);
    }
}