#include <stdio.h>
int main()
{
    int i, j, m, n, sum=0, s=0;
    printf("���뷶Χ���ÿո������");
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
    printf("\n��%d����", sum);
    return 0;
}
