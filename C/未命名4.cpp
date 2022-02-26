#include<stdio.h>
#include<ctype.h>
int main()
{
	char a, lower;
	printf("输入一个大写字母：");
	scanf("%c", &a);
	lower='A' + 32;
	printf("%c, %d", lower, lower);
	return 0;
}
