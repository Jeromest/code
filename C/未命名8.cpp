#include<stdio.h>
int main()
{
	int year, month, day;
	printf("输入年份和月份：");
	scanf("%d%d%d", &year, &month, &day); 
	if(month>=1 && month<=12)
	if(year%400==0 || (year%4==0 && year%100!=0))
	{
		switch(month)
		{
			case 1: printf("第%d天!", day);break;//31
			case 2: printf("第%d天!", 31+day);break;//29
			case 3: printf("第%d天!", (31*2)+day);break;//31
			case 4: printf("第%d天!", (31*2)+29+day);break;//30
			case 5: printf("第%d天!", (31*3)+29+30+day);break;//31
			case 6: printf("第%d天!", (31*3)+29+(30*2)+day);break;//30
			case 7: printf("第%d天!", (31*3)+(30*2)+29+day);break;//31
			case 8: printf("第%d天!", (31*3)+(30*2)+29+day);break;//31
			case 9: printf("第%d天!", +day);break;//30
			case 10: printf("第%d天!", +day);break;//31
			case 11: printf("第%d天!", +day);break;//30
			default: printf("第%d天!", (31*6)+(30*4)+29+day);//31
		} 
	}
	else
	{
		switch(month)
		{
			case 1: printf("第%d天!", day);break;//31
			case 2: printf("第%d天!", 29+day);break;//28
			case 3: printf("第%d天!", day);break;//31
			case 4: printf("第%d天!", day);break;//30
			case 5: printf("第%d天!", day);break;//31
			case 6: printf("第%d天!", day);break;//30
			case 7: printf("第%d天!", day);break;//31
			case 8: printf("第%d天!", day);break;//31
			case 9: printf("第%d天!", day);break;//30
			case 10: printf("第%d天!", day);break;//31
			case 11: printf("第%d天!", +day);break;//30
			default: printf("第%d天!", day);//31
		} 
	}
	return 0;
}
