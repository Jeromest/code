#include<stdio.h>
#include<stdlib.h>
#define LINE 7
#define TIMELEN 8
#define ROW 64

unsigned char rightMove(int arg)
{
	int num[] = {59, 59, 59, 61, 61, 61, 61, 126, 36, 58, 58, 49, 57, 57, 0};
	int getnum = arg / ROW;
	int dealnum = arg & 2 ? 1 : 8;
	if(arg & 4)
	{
		getnum += 8;
	}
	return num[getnum] / dealnum % 8;
}

char output(int arg)
{
	int count, timenum;
	char tmp[] = "\x3f\x28\x75\x79\x6a\x5b\x5f\x29\x7f\x7b\x40";
	if(--arg % ROW)
	{
		count = LINE - arg / TIMELEN % TIMELEN;
		timenum = _TIME_[count] - '0';
		if((tmp[timenum] & 1 << rightMove(arg)))
		{
			return '!';
		}
		return ' ';
	} 
	else
	{
		return '\n';
	}
} 

int main(int arg)
{
	if(arg != ROW * LINE)
	{
		main(arg + 1); 
	}
	putchar(output(arg));
}

//int main(_){_^448&&main(-~_);putchar(--_%64?32|-~7[_TIME_-_/8%8][">'txiZ^(~z?"-48]>>";;;====~$::199"[_*2&8|_/64]/(_&2?1:8)%8&1:10);}
