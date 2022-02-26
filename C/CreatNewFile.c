#include<stdio.h>
#include<conio.h>
int main()
{
	//int i;
	char filename[20], ch;
	FILE *fp;
	printf("输入文件名：");
	scanf("%s", filename);
	printf("输入想写入的字符：");
	if((fp = fopen(filename, "w")) == NULL)
	{
		printf("文件打开失败！");
	}else{
		while((ch = getch()) != '\015')
		fputc(ch, fp);
	}
	fclose(fp);
//	fp = fopen("E://CreatFile.txt", "r");
//	for(i=1;i<=100;i++)
//	{
//		fputs("i ", fp);
//	} 
//	if(fp == NULL)
//	{
//		printf("文件打开失败！");
//	}else{
//		printf("文件打开成功！");
//		fclose(fp);
//	}
	
	return 0;
}
