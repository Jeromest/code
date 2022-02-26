#include<stdio.h>
int main()
{
	int count=0;
	for(int i=0; i<=100; i++)
	{
		int j=0;
		for(j=2; j<=i; j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(i==j)
		{
			//count++;
			printf("%d ",i);
		}
	}
	//printf("\ncount=%d\n",count);

	return 0;

}
