#include<stdio.h>
int main()
{
	int i, sum = 0;
	for(i=0; i<=100; i++)
	{
		sum+=i/2;
	}
	printf("%d", sum);
	
	return 0;
}

