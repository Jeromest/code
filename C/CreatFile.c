#include<stdio.h>
#include<conio.h>
int main()
{
	char i;
	FILE *fp;
	fp = fopen("E://CreateFile.txt", "w");
	for(i=0; i<10; i++)
	{
		fputc("i ", fp);
	}
	fclose(fp);
	
	return 0;
}
