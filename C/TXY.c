#include<stdio.h>
int main()
{
	int f, h, x=0, y=0;
	scanf("%d %d", &h, &f);
	x=(4*h-f)/2;
	y=(f-2*h)/2;
	h=x+y;
	f=x*4+y*2;
	printf("º¶%d÷ª, Õ√%d÷ª", x, y); 
	return 0;
}
