#include<stdio.h>
#include<windows.h>

int main()
{
	int i, j, k;
	
	for(i=1; i<=9; i++)
	{
		for(j=1; j<=i; j++)
		{
			printf("%d*%d=%d\t", j, i, i*j);
		} 
		printf("\n");
	} 
	system("color 0a");
	return 0;
}
