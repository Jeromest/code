
#include <windows.h>



//���ڹ��̺���

LRESULT CALLBACK WndProc(HWND,UINT, WPARAM, LPARAM);





int WINAPI WinMain(HINSTANCE hInstance,HINSTANCE hPrevInstance,PSTR szCmdLine,int iCmdShow)

{

//���崰����ṹ�����

	WNDCLASS wc;



//����������

	static TCHAR* szAppName =TEXT("zixue7");



//���ھ��

	HWND hwnd = NULL;



//��Ϣ�ṹ

	MSG msg;



	/**

	����Ĵ�����䴰������Ϣ����ͼ�꣬�����ʽ�����������̺�����

	*/

	wc.style = CS_HREDRAW | CS_VREDRAW; //������ʽ

	wc.lpfnWndProc = WndProc; //���̺���

	wc.cbClsExtra = 0; //��չ�ֶ�

	wc.cbWndExtra = 0; //��չ�ֶ�

	wc.hInstance = hInstance; //��ǰʵ�����

	wc.hIcon = LoadIcon(hInstance,IDI_APPLICATION); //���ó���ͼ��

	wc.hCursor = LoadCursor(NULL,IDC_ARROW); //�������



//�ð�ɫ��ˢ��䱳��

	wc.hbrBackground = (HBRUSH)GetStockObject(WHITE_BRUSH);



//�˵�

	wc.lpszMenuName = NULL;



//����

	wc.lpszClassName = szAppName;





//�����ϵͳע�ᴰ����

	if (!RegisterClass(&wc))

	{

		MessageBox(NULL,TEXT("����ֻ����windowsNT������"),

		           szAppName, MB_ICONERROR);

		return 0;

	}



//��������

	hwnd = CreateWindow(szAppName, //Ҫע��Ĵ�������

	                    TEXT("c���Ա�д�ĵ�һ�����ڳ���-www.zixue7.com"),//���ڱ���

	                    WS_OVERLAPPEDWINDOW, //������ʽ

	                    CW_USEDEFAULT, //���ھ�����Ļ���ϽǶ�������

	                    CW_USEDEFAULT, //���ھ�����Ļ���ϽǶ�������

	                    400, //���ڿ��

	                    300, //���ڸ߶�

	                    NULL, //�����ھ��

	                    NULL, //�˵����

	                    hInstance, //��ǰʵ�����

	                    NULL); //ָ��һ��ֵ��ָ�룬��ֵ���ݸ����� WM_CREATE��Ϣ��һ��ΪNULL



//��ʾ����

	ShowWindow(hwnd, iCmdShow);



//���´���

	UpdateWindow(hwnd);





//��Ϣѭ����һֱͣ������˳���Ϣѭ���ͱ�ʾ��������ˡ�

	while (GetMessage(&msg,NULL, 0, 0))

	{

//������Ϣ

		TranslateMessage(&msg);



//�ַ���Ϣ

		DispatchMessage(&msg);

	}





	return msg.wParam;

}





/**

��Ϣ������

*/

LRESULT CALLBACK WndProc(HWND hwnd,UINT message,WPARAM wParam,LPARAM lParam)

{

	switch (message)

	{

		case WM_DESTROY:

//���ͽ�����������Ĳ���Ϊ�˳���

			PostQuitMessage(0);

			break;

	}



//����Ĭ�ϵĹ��̺���

	return DefWindowProc(hwnd,message, wParam, lParam);

}


