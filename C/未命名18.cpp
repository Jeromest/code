#include <stdio.h>
int main() {
	int a[4], nums, t1, t2;
	printf("请输入4位数:\n");
	scanf("%d",&nums);
	a[0]=nums%10;
	a[1]=nums/10%10;
	a[2]=nums/100%10;
	a[3]=nums/1000%10;
	for (int i=0; i<=3; i++) { //每个数字+5加密，满十取个位
		a[i]+=5;
		a[i]%=10;
	}
	t1=a[0];
	a[0]=a[3];
	a[3]=t1;
	
	t2=a[1];
	a[1]=a[2];
	a[2]=t2;
	for (int i=3; i>=0; i--) {
		printf("%d",a[i]);

	}
	return 0;
}
