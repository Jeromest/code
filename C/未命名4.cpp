#include<stdio.h>
#include<ctype.h>
int main()
{
	char a, lower;
	printf("����һ����д��ĸ��");
	scanf("%c", &a);
	lower='A' + 32;
	printf("%c, %d", lower, lower);
	return 0;
}
