//Write a program to swap the values of two variable
#include<stdio.h>
#include<math.h>
void main()
{
	int a=7,b=4;
	printf("\n A=%d B=%d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nNow A=%d B=%d",a,b);
	
}

