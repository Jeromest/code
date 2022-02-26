#include<stdio.h>
int jc(int x);

int main()
{
	int i;
	for(i=1;i<=5;i++)
	{
		printf("%d!=%d\n", i, jc(i));
	}
	return 0;
}

int jc(int x)
{
	static int s=1;
	s *= x;
	return s;
}
