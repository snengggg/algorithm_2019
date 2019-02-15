//
// Created by 이선행 on 2019-02-10.
//

#include<iostream>

int main(){
    int n, a, b;
    scanf("%d", &n);
    for(int i = 0; i< n; i++){
        scanf("%d %d", &a, &b);
        printf("%d\n", a+b);
    }
}