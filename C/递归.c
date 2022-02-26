#include<stdio.h>
long dg(int n);

int main()
{
	int n;
	printf("请输入一个整数：");
	scanf("%d", &n);
	
	printf("%d! = %ld\n", n, dg(n));
	return 0;
} 

long dg(int n)
{
	int a;
	if(n<0)
	{
		printf("Error!");
	}
	else if(n==0 || n==1)
	{
		a = 1;
	}
	else
	{
		a = dg(n-1)*n;
	}
	return a;
} 
