#include <windows.h>

#include <stdio.h>



void CALLBACK TimerProc(HWND hWnd,UINT nMsg,UINT nTimerid,DWORD dwTime)

{

	printf("%s","abc");

}



int main(void)

{

	int timerId = 0;



//����һ����ʱ�������ض�ʱ����ʶ

	timerId = SetTimer(NULL, 0, 1000, TimerProc);



//�������ʧ�ܣ��˳�����

	if(0 == timerId)

	{

		printf("��ʱ������ʧ��");

		return 1;

	}



//��Ϣ�ṹ��

	MSG   msg;



//��Ϣѭ��

	while(GetMessage(&msg,NULL,0,0))

	{

		//������Ϣ

		TranslateMessage(&msg);

//�ַ���Ϣ

		DispatchMessage(&msg);

	}



//���ٶ�ʱ��

	KillTimer(NULL, timerId);



	return 0;

}
