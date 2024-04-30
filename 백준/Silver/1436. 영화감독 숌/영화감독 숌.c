#include <stdio.h>
int main(void) {
    int N;
    scanf("%d\n",&N);
    int f = 665;
    int count = 0;
 
    while (1) {
        if (count == N) {
            printf("%d",f);
            break;
        }
        f++;
        for (int i=0; i<=10; i++) {
            if (f/(int)pow(10,i)%1000==666) {
                count++;
                break;
            }
        }
    }
    return 0;
}