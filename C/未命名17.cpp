#include <stdio.h>

int main() {
	int a, c, num, temp;
	for(a = 0; a <= 9; a++) {
		for(c = 0; c <= 9; c++) {
			if(a !=c) {
				num = 1000 * a + 100 * a + 10 * c + c;
				for(temp = 0; temp <=99; temp++) {
					if(temp * temp == num) {
						printf("%d",num);
					}
				}
			}
		}
	}
	return 0;
}
