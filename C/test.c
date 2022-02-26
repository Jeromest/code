#include<stdio.h>
int main(void)
{
	int a = 2, i = 0;
	puts("输出的值为：");
	while(i < 20)
	{
		a++;
		i = a++;
		printf("当a的值为%3d\n", a);	
		printf("i的值为%3d\n", i);
	}
	puts("程序结束");
	
	return 0;
} 
