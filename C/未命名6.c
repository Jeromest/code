#include<stdio.h>
#include<math.h>
int main()
{
    float a, b, c, x1, x2;
    printf("�����뷽�̵�abc��");
    scanf("%f %f %f", &a, &b, &c);
    if (b*b - 4 * a*c < 0)
    {
        printf("û��ʵ��");
    }
    else
    {
        x1 = (-b + sqrt(b * b - 4 * a*c)) / (2 * a);
        x2 = (-b - sqrt(b * b - 4 * a*c)) / (2 * a);
        printf("x1=%.2f,x2=%.2f", x1, x2);
    }
    return 0;
    
}

