#include <stdio.h>
int main(void) {
    int N=0;
    int a;
    
    scanf("%d",&N);
    a=N/5;
    if (N%5!=0) {
        for (a;a>=0;a--){
            if((N-5*a)%3==0) {
                a=a+(N-5*a)/3;
                break;
            }
        }
    }
    printf("%d",a);
    return 0;
}