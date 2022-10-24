//Write a program to accept the string through the keyboard using the gets() function
#include<stdio.h>
void main()
{
	char ch[30];
	printf("Enter the String :");
	gets(ch);
	printf("\nEntered String :%s",ch);
}
