#include <iostream>

int main() {

    int cost[4];
    int dp[13];
    int curdp1 = 0;
    int curdp2 = 0;
    int curdp3 = 0;
    int T = 0;
    scanf("%d", &T);
    int curN;
    for (int t = 1; t <= T; t++) {
        curN = 0;
        dp[0] = 0;

        for (int i = 0; i < 4; i++) {
            scanf("%d", &cost[i]);
        }

        for (int i = 1; i <= 12; i++) {
            scanf("%d", &curN);

            if (curN == 0) {
                dp[i] = dp[i - 1];
                continue;
            }
            curdp1 = dp[i - 1] + curN * cost[0];
            curdp2 = dp[i - 1] + cost[1];

            if (curdp1 < curdp2) {
                dp[i] = curdp1;
            } else {
                dp[i] = curdp2;
            }

            if (i >= 3) {
                curdp3 = dp[i - 3] + cost[2];
                if (curdp3 < dp[i]) {
                    dp[i] = curdp3;
                }
            }
        }
        if (dp[12] > cost[3]) {
            dp[12] = cost[3];
        }
        printf("#%d %d\n", t, dp[12]);

    }
    return 0;
}