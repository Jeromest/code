#include<stdio.h>
int main()
{
	int year, month, day;
	printf("������ݺ��·ݣ�");
	scanf("%d%d%d", &year, &month, &day); 
	if(month>=1 && month<=12)
	if(year%400==0 || (year%4==0 && year%100!=0))
	{
		switch(month)
		{
			case 1: printf("��%d��!", day);break;//31
			case 2: printf("��%d��!", 31+day);break;//29
			case 3: printf("��%d��!", (31*2)+day);break;//31
			case 4: printf("��%d��!", (31*2)+29+day);break;//30
			case 5: printf("��%d��!", (31*3)+29+30+day);break;//31
			case 6: printf("��%d��!", (31*3)+29+(30*2)+day);break;//30
			case 7: printf("��%d��!", (31*3)+(30*2)+29+day);break;//31
			case 8: printf("��%d��!", (31*3)+(30*2)+29+day);break;//31
			case 9: printf("��%d��!", +day);break;//30
			case 10: printf("��%d��!", +day);break;//31
			case 11: printf("��%d��!", +day);break;//30
			default: printf("��%d��!", (31*6)+(30*4)+29+day);//31
		} 
	}
	else
	{
		switch(month)
		{
			case 1: printf("��%d��!", day);break;//31
			case 2: printf("��%d��!", 29+day);break;//28
			case 3: printf("��%d��!", day);break;//31
			case 4: printf("��%d��!", day);break;//30
			case 5: printf("��%d��!", day);break;//31
			case 6: printf("��%d��!", day);break;//30
			case 7: printf("��%d��!", day);break;//31
			case 8: printf("��%d��!", day);break;//31
			case 9: printf("��%d��!", day);break;//30
			case 10: printf("��%d��!", day);break;//31
			case 11: printf("��%d��!", +day);break;//30
			default: printf("��%d��!", day);//31
		} 
	}
	return 0;
}
