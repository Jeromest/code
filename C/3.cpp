#include <windows.h>

#include <stdio.h>



void CALLBACK TimerProc(HWND hWnd,UINT nMsg,UINT nTimerid,DWORD dwTime)

{

	printf("%s","abc");

}



int main(void)

{

	int timerId = 0;



//创建一个定时器，返回定时器标识

	timerId = SetTimer(NULL, 0, 1000, TimerProc);



//如果创建失败，退出程序

	if(0 == timerId)

	{

		printf("定时器创建失败");

		return 1;

	}



//消息结构体

	MSG   msg;



//消息循环

	while(GetMessage(&msg,NULL,0,0))

	{

		//翻译消息

		TranslateMessage(&msg);

//分发消息

		DispatchMessage(&msg);

	}



//销毁定时器

	KillTimer(NULL, timerId);



	return 0;

}
