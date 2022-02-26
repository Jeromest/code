#include<stdio.h>
void chengfabiao();
int main()
{
	chengfabiao();
	return 0;
}

void chengfabiao()
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
}
