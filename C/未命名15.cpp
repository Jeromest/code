#include<stdio.h>
int main()
{
	int a, b, c, count=0;
	for(a=0; a<=20; a++)
		for(b=0; b<=33; b++)
			for(c=0; c<=100; c++)
				if(a*5+b*3+c/3==100 && a+b+c==100 && c%3==0)
				{
					count++;
					printf("%d %d %d\n", a, b, c);
				}
				printf("有%d种组合！", count);
	return 0;
}
