#include<stdio.h>
int main()
{
	int i, a, max=0, min=0;
	for(i=0; i<10; i++)
	{
		scanf("%d", &a);
		min=a;
		if(a>max)
		{
			max=a;
		}
		if(a<min)
		{
			min=a;
		}		
	}
	printf("max=%d\tmin=%d", max, min);
	
	return 0;
}

