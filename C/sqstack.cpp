//以top=base表示空栈
#include <iostream.h>
#include<malloc.h>
#include<stdlib.h>
#define OK 1
#define YES 1
#define FALSE 0
#define ERROR 0
#define OVERFLOW -2
typedef int SElemType;
#define Stack_Init_Size 20
#define StackIncreament 10
//----------------栈的顺序存储表示---------------
typedef struct{
SElemType *base;   //栈底
SElemType *top;   //栈顶
int stacksize;   //当前分配的最大容量
}SqStack;
//--------------基本操作的算法描述---------------
//构造
int InitStack(SqStack &S){
//构造一个空栈S
S.base=(SElemType *)malloc(Stack_Init_Size*sizeof(SElemType));
if(!S.base) return OVERFLOW;
S.top=S.base;
S.stacksize=Stack_Init_Size;
return OK;
}//Inital
//读取栈顶元素，但不取出
int GetTop(SqStack S,SElemType &e){
if(S.top==S.base) return ERROR;
e=*(S.top-1);//读取但是不取出来；
return OK;
}//Gettop
//进栈
int Push(SqStack &S,SElemType e){
//插入元素e为新的栈顶元素
if(S.top-S.base>=S.stacksize){
S.base=(SElemType *)realloc(S.base,(S.stacksize+StackIncreament)*sizeof(SElemType));
if(!S.base) return ERROR;
S.top=S.base+S.stacksize;
S.stacksize+=StackIncreament;
}
*(S.top++)=e;
return OK;
}//Push
//退栈
int Pop(SqStack &S,SElemType &e){
if(S.base==S.top) return ERROR;
e=*--S.top;
return OK;
}//Pop
//栈长
int StackLength(SqStack L){
return L.top-L.base;
}//stacklength
//栈空
int StackEmpty(SqStack L){
if(L.base==L.top) return YES;
else return FALSE;
}//StackEmpty
//栈的遍例
void StackTraverse(SqStack S,void (* visit)(SElemType)){
SElemType *p=S.base;
while(p!=S.top){
   (*visit)(*p);
   p++;
   }
}