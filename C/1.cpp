#include <windows.h>



int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevinstance, PSTR szCmdLine, int iCmdShow)

{

	MessageBox(NULL, TEXT("窗口内容"), TEXT("窗口标题"), MB_OK);

	return 0;

}
