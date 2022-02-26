#include <stdio.h>

int main() {
	int arr[5] = {0}, i, j;
	for (i = 0; i <= 5; i++) {
		scanf("%d", &arr[i]);
	}
	
	for (j = 0; j <= 5; j++) {
		for (i = 0; i <= 5; i++) {
			printf("%d ", arr[i]);
		}
		printf("\n");
	}
	return 0;
}
