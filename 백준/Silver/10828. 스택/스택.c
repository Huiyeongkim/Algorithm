#include <stdio.h>
int number[100001];
int count = 0;
void push(int num) {
    number[count] = num;
    count++;
}
void pop() {
    if (count!=0) {
        count--;
        printf("%d\n",number[count]);
        number[count] = 0;
    }
    else 
        printf("-1\n");
}
void top() {
    if (count!=0) printf("%d\n",number[count-1]);
    else
        printf("-1\n");
}
void size() {
    printf("%d\n",count);
}
void empty() {
    if (count!=0) printf("0\n");
    else 
        printf("1\n");
}
int main(void) {
    int N;
    scanf("%d\n",&N);
    char stack[10];
    int number[100];
    for (int i=0; i<N; i++) {
        scanf("%s",&stack);
        if (strcmp(stack,"push")==0) {
            int num;
            scanf("%d",&num);
            push(num);
        }
        else if (strcmp(stack,"pop")==0) pop();
        else if (strcmp(stack,"top")==0) top();
        else if (strcmp(stack,"size")==0) size();
        else if (strcmp(stack,"empty")==0) empty();
    }
    return 0;
}