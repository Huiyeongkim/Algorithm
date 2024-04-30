#include <stdio.h>
int main(void) {
    int T;
    scanf("%d",&T);
    int N, M;
    for (int i=0; i<T; i++) {    
        scanf("%d %d\n",&N, &M);
        if (N==M) {
            printf("1\n");
        }
        else {
            double A=1, B=1;
            for (int j=0; j<N; j++) {
                A=A*M;
                M--;
            }
            for (int j=N; j>1; j--) {
                B=B*j;
            }
            printf("%.lf\n",A/B);
        }
    }
    return 0;
}