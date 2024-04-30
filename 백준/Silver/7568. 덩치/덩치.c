#include <stdio.h>
int main(void) {
    int N;
    scanf("%d\n",&N);
    int x[50];
    int y[50];
    
    for (int i=0; i<N; i++) {
        scanf("%d %d\n",&x[i],&y[i]);
    }
    for (int i=0; i<N; i++) {
        int cnt = 1;
        for (int j=0; j<N; j++) {
            if (x[i]<x[j] &&y[i]<y[j]) cnt++;
        }
        printf("%d ",cnt);
    }
    return 0;
}