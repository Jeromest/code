#include<stdio.h>
#include<conio.h>
int main()
{
	//int i;
	char filename[20], ch;
	FILE *fp;
	printf("�����ļ�����");
	scanf("%s", filename);
	printf("������д����ַ���");
	if((fp = fopen(filename, "w")) == NULL)
	{
		printf("�ļ���ʧ�ܣ�");
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
//		printf("�ļ���ʧ�ܣ�");
//	}else{
//		printf("�ļ��򿪳ɹ���");
//		fclose(fp);
//	}
	
	return 0;
}
