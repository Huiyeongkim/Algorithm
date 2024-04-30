#include <stdio.h> 
int main(void) {
    char a[100];
    int i;
    
    gets(a);
    int len = strlen(a);
    for(i=0;i<strlen(a);i++) {
        if(a[i] == '=') { 
            if(a[i-1] == 'c') len--; 
            if(a[i-1] == 's') len--; 
            if(a[i-1] == 'z') { 
                len--; 
                if(a[i-2] == 'd') len--; 
            } 
        } 
        if(a[i] == '-') { 
            if(a[i-1] == 'c') len--; 
            if(a[i-1] == 'd') len--; 
        } 
        if(a[i] == 'j') { 
            if(a[i-1] == 'l') len--; 
            if(a[i-1] == 'n') len--; 
        }
    } 
    printf("%d", len);
    return 0;
} 