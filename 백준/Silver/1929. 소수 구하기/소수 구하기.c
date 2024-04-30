#include <stdio.h>
int main(void) {
    int a, b;
    int arr[1000001]; 
    arr[0] = 1;                 
	arr[1] = 1;
 
    scanf("%d %d",&a,&b);
	for (int i = 2; i <= b; i++) {
		for (int j = i * 2; j <= b; j+=i) {
			if(arr[j] == 0) arr[j] = 1;
		}
	}
	for (int i = a; i <= b; i++){
		if (arr[i] == 0) printf("%d\n", i);
	}
    return 0;
}