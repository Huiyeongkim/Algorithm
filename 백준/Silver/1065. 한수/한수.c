#include <stdio.h>
int d(int N) {
	int x = N % 10;
	int y = N / 10 % 10;
	int z = N / 100 % 10;

	if (y*2 == x+z) return 1;
	return 0;
}
int main(void) {
	int N;
    int a;
    
	scanf("%d\n", &N);
	if (N < 100) {
		a = N;
	}
	else {
		a = 99;
		if (N == 1000) N = 999;
		for (int i = 100; i <= N; i++) {
			a = a + d(i);
		}
	}
	printf("%d\n", a);
	return 0;
}