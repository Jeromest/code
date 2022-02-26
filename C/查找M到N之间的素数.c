#include <stdio.h>
int main()
{
    int i, j, m, n, sum=0, s=0;
    printf("输入范围，用空格隔开：");
    scanf("%d%d",&m,&n);
    for(i=m;i<=n;i++)
    {
        s=0;
        for(j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                s=1;
                break;
            }
        }
        if(i>1 && s==0)
        {
            printf("%d ",i);
            sum++;
        }
    }
    printf("\n共%d个！", sum);
    return 0;
}
