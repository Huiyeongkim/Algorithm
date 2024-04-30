#include <stdio.h>
#include <string.h>
int cnt;

int recursion(const char *s, int l, int r){
    cnt++;
    if(l >= r) return 1;
    else if(s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
}

int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}

int main(void){
    int T;
    int pal;
    char S[1001];
    
    scanf("%d",&T);
    for (int i=0; i<T; i++) {
        cnt=0;
        scanf("%s",S);
        pal=isPalindrome(S);
        printf("%d %d\n",pal, cnt);
    }
}