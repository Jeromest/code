#include<stdio.h>
int main()
{
     int a,r,i=0,j=1,count[100];   
     printf("������һ��ʮ��������:\n");
     scanf("%d",&a);
     do               
    {
         r=a%8;       
         a=a/8;
         i++;
        count[i]=r;
     }
    while(a!=0);
     printf("ʮ��������ת��Ϊ�˽�������:\n");
     for(j=i;j>0;j--)                     //������� 
        printf("%d",count[j]);
        
    return 0;
}
