#include<stdio.h>
int main(){
	
	int A[3][3];
	int i, j;
	
	for(i=0; i<3; i++){
		A[i][0] = i;
		for(j=0; j<3; j++){
			A[0][j] = j;
			printf("%d", A[i][j]);
//			if((i+j) % 2 == 0){
//				printf(" ");
//			} else {
//				printf("+");
//			}
		}
		printf("\n");
	}
	
	
	return 0;
} 
