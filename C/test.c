#include<stdio.h>
int main(void)
{
	int a = 2, i = 0;
	puts("�����ֵΪ��");
	while(i < 20)
	{
		a++;
		i = a++;
		printf("��a��ֵΪ%3d\n", a);	
		printf("i��ֵΪ%3d\n", i);
	}
	puts("�������");
	
	return 0;
} 
