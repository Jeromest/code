#include<stdio.h>
int main()
{
	int a[12], max=0, sum=0;
	for(int i=0; i<12; i++)
	{
		scanf("%d", &a[i]);
		sum+=a[i];
		max=a[1];
		if(a[i]>max)
		{
			max=a[i];
		}
	}
		printf("���ֵ��%d\nƽ��ֵ��%d\n", max, sum/12);
	return 0;
} 
