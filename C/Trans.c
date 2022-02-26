#include<stdio.h>
#include"sqstack.cpp"

void trans(int n);

int main()
{
	trans(10);
	return 0;
}

void trans(int n)
{
	int e;
	SqStack *st;
	InitStack(st);
	
	while(n>0)
	{
		Push(st, n%2);
		n/=2;
	}
	
	while(!StackEmpty(st))
	{
		Pop(st, e);
		printf("%d", e);
	}
	printf("\n");
}
