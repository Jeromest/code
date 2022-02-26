#include<stdio.h> 
int main() {
	
	char a[100] = {'\0'};
	while(gets(a) != EOF) {
		printf("%s\n", a);
	}
	
	return 0;
}
