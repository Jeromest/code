#include<stdio.h>
int main()
{
     int a,r,i=0,j=1,count[100];   
     printf("请输入一个十进制整数:\n");
     scanf("%d",&a);
     do               
    {
         r=a%8;       
         a=a/8;
         i++;
        count[i]=r;
     }
    while(a!=0);
     printf("十进制整数转换为八进制数是:\n");
     for(j=i;j>0;j--)                     //倒序输出 
        printf("%d",count[j]);
        
    return 0;
}
