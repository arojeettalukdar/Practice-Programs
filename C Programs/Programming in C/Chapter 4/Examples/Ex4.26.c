// Write a program to show the effects of sleep() function
#include<stdio.h>
#include<stdio.h>
void main()
{
	static char t[10];
	printf("\n Enter the Text Here :");
	gets(t);
	printf("\n You Entered Text :");
	sleep(5);
	puts(t);
	getche();
}
