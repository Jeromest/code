
#include <windows.h>



//窗口过程函数

LRESULT CALLBACK WndProc(HWND,UINT, WPARAM, LPARAM);





int WINAPI WinMain(HINSTANCE hInstance,HINSTANCE hPrevInstance,PSTR szCmdLine,int iCmdShow)

{

//定义窗口类结构体变量

	WNDCLASS wc;



//窗口类名称

	static TCHAR* szAppName =TEXT("zixue7");



//窗口句柄

	HWND hwnd = NULL;



//消息结构

	MSG msg;



	/**

	下面的代码填充窗口类信息，如图标，鼠标样式，背景，过程函数等

	*/

	wc.style = CS_HREDRAW | CS_VREDRAW; //窗口样式

	wc.lpfnWndProc = WndProc; //过程函数

	wc.cbClsExtra = 0; //扩展字段

	wc.cbWndExtra = 0; //扩展字段

	wc.hInstance = hInstance; //当前实例句柄

	wc.hIcon = LoadIcon(hInstance,IDI_APPLICATION); //设置程序图标

	wc.hCursor = LoadCursor(NULL,IDC_ARROW); //设置鼠标



//用白色画刷填充背景

	wc.hbrBackground = (HBRUSH)GetStockObject(WHITE_BRUSH);



//菜单

	wc.lpszMenuName = NULL;



//类名

	wc.lpszClassName = szAppName;





//像操作系统注册窗口类

	if (!RegisterClass(&wc))

	{

		MessageBox(NULL,TEXT("程序只能在windowsNT下运行"),

		           szAppName, MB_ICONERROR);

		return 0;

	}



//创建窗口

	hwnd = CreateWindow(szAppName, //要注册的窗口类名

	                    TEXT("c语言编写的第一个窗口程序-www.zixue7.com"),//窗口标题

	                    WS_OVERLAPPEDWINDOW, //窗口样式

	                    CW_USEDEFAULT, //窗口距离屏幕左上角都横坐标

	                    CW_USEDEFAULT, //窗口距离屏幕左上角都纵坐标

	                    400, //窗口宽度

	                    300, //窗口高度

	                    NULL, //父窗口句柄

	                    NULL, //菜单句柄

	                    hInstance, //当前实例句柄

	                    NULL); //指向一个值的指针，该值传递给窗口 WM_CREATE消息。一般为NULL



//显示窗口

	ShowWindow(hwnd, iCmdShow);



//更新窗口

	UpdateWindow(hwnd);





//消息循环，一直停在这里，退出消息循环就表示程序结束了。

	while (GetMessage(&msg,NULL, 0, 0))

	{

//翻译消息

		TranslateMessage(&msg);



//分发消息

		DispatchMessage(&msg);

	}





	return msg.wParam;

}





/**

消息处理函数

*/

LRESULT CALLBACK WndProc(HWND hwnd,UINT message,WPARAM wParam,LPARAM lParam)

{

	switch (message)

	{

		case WM_DESTROY:

//发送结束请求，里面的参数为退出码

			PostQuitMessage(0);

			break;

	}



//调用默认的过程函数

	return DefWindowProc(hwnd,message, wParam, lParam);

}


