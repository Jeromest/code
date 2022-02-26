#include<stdio.h>
int main()
{
	int n, a, b, c, d, t1, t2;
	scanf("%d", &n);
	a=n/1000;
	b=n/100%10;
	c=n/10%10;
	d=n%10;
	
	a+=5;
	b+=5;
	c+=5;
	d+=5;
	
	a=a%10;
	b=b%10;
	c=c%10;
	d=d%10; 
	
	t1=a;
	a=d;
	d=t1;
	
	t2=b;
	b=c;
	c=t2;
	
	
	printf("%d %d %d %d", a, b, c, d);
	
	return 0;
 } 
