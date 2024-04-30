#include <stdio.h>
int main(void) {
	int n;
    int a= 0, check = 0;
	char word[101];
	scanf("%d", &n);
    
	for (int i= 0; i< n; i++) {
		scanf("%s", word);                     
        for (int j = 1; j < strlen(word); j++) {
			if (word[j] != word[j - 1]) {
				for (int k = 0; k < j - 1; k++) {
					if (word[j] == word[k]) {
						check = 1;
						break;
					}
				}
			}
		}
		if (check != 1) a++;
		else {
			check = 0;
		}
	}
	printf("%d\n", a);
	return 0;
}