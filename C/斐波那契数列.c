#include<stdio.h>
int main() {
        int num[20], i, j;
        num[0] = 0;
        num[1] = 1;
        printf("쳲���������ǰ20���ֵ���£�");
        printf("%d %d ", num[0], num[1]);
        for(i = 2; i < 20; i++){
            num[i] = num[i - 1] + num[i - 2];
            printf("%d ", num[i]);
        }
        printf("\n");
        printf("�������£�");
        for(j=19; j>=0; j--){
        	printf("%d ", num[j]);
		}
    }


