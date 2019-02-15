#include <iostream>

int main() {


    int N = 0;
    scanf("%d", &N);

    int first = 0, last = 0, sum = 0, cnt = 0;

    while (first <= N) {

        if (sum <= N) {
            if (sum == N) {
                cnt++;
            }
            sum += ++first;

        } else {
            sum -= ++last;
        }

    }

    printf("%d", cnt);


    return 0;
}