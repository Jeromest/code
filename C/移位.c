#include<stdio.h>
int main()
{
	char str = 10000000;
	int LED[8] = {};
	int i;
	for(i=0; i<8; i++)
	{
		printf("%d\n", str);
		LED[i] = str>>1;
//		str = str<<2;
//		str = str>>1;
		printf("%x", LED[i]);
	}
	return 0;
} 
