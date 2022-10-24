//Write a program to read string using cgets() and display it using cputs().
#include<stdio.h>
#include<conio.h>
void main()
{
	static char *t;
	printf("\n Enter Text Here :");
	cgets(t);
	t+=2;
	printf("\n Your Entered Text :");
	cputs(t);
	getche();
}
