#include<stdio.h>
int main() {
	int i, j, k;
	for(i=1; i<=5; i++) {
		for(j=1; j<=6-i; j++) {
			printf(" ");
		}
		for(k=1; k<=1+(i-1)*2; k++) {
			printf("*");
		}
		printf("\n");
	}
	for(i=1; i<=5; i++) {
		for(j=6; j>=6-i; j--) {
			printf(" ");
		}
		for(k=6; k>=(i-1)*2; k--) {
			printf("*");
		}
		printf("\n");
	}
	return 0;
}

