#include <stdio.h>
#include <math.h>

int main()
{
 int arr[5] = { 0 }, i, j, a=0;
 for (i = 0; i <= 5; i++)
  scanf("%d",&arr[i]);
 for (i = 0; i <= 5; i++)
 {  
   for (j = 0; j <= 5; j++)
   {
    
    printf("%d", arr[j]);
    a++;
   }  
  printf("\n");
 }
 return 0;
}
