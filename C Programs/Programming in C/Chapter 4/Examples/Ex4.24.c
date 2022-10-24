//Write a program to accept the string through the keyboard using the puts() function
#include<stdio.h>
#include<conio.h>
void main()
{
	char ch[30];
	printf("Entered String:-");
	gets(ch);
	puts("Entered String:-");
	puts(ch);
}
