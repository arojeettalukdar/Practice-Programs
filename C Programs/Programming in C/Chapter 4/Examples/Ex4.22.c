//Write a program to read and display the charater using getche() and putch()
#include<stdio.h>
void main()
{
	char ch;
	printf("Press any key t continue");
	ch=getch();
	printf("\n You pressed :");
	putch(ch);
}
