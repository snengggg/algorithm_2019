#include<iostream>


int pLen, pCnt;
char map[8][8];
int dx[] = {1, 0, -1, 0};
int dy[] = {0, 1, 0, -1};

bool jakPelindrom(int y, int x, int boundCheck) {

    int cnt = 0;
    int cnt2 = 1;
    int total = 0;

    if ((y < boundCheck && x < boundCheck) || (7 - y < boundCheck && 7 - x < boundCheck)) {
        return false;
    }


    while(boundCheck <= cnt){
        if(map[y + dy[0] * cnt] != map[y + dy[2] * cnt2]){
            break;
        }
    }
    total++;

    while(boundCheck <= cnt){

    }
    for(int i = 1; i <= boundCheck; i++){
        if(map[y + dy[1] * i] != map[y + dy[3] * i]){
            return false;
        }
    }
    return true;
};

bool holPelindrom(int y, int x, int boundCheck) {

    if ((y < boundCheck && x < boundCheck) || (7 - y < boundCheck-1 && 7 - x < boundCheck-1)) {
        return false;
    }
    return true;
};


int main() {





    int holjak;

    for (int t = 1; t <= 10; t++) {

        pCnt = 0;
        scanf("%d", &pLen);
        int holjak = pLen % 2;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                scanf("%c", &map[i][j]);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (holjak == 0) {
                    if (jakPelindrom(i, j, pLen / 2)) {
                        pCnt++;
                    }
                } else {
                    if (holPelindrom(i, j, pLen / 2)) {
                        pCnt++;
                    }
                }

            }
        }
    }
}

