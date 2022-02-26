#include<stdio.h>
int main(){
	
	int a=0;
	while(1){
		if(a*a + a*a*a == 392){
			
			printf("a=%d", a); 
			break; 
		} 
//		printf("%d", a); 
		a++;
	}
	
	return 0;
}
