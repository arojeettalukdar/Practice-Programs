//Write a program using curly braces in if block. Enter only the three number and calculate thier sum and multiplication
#include<stdio.h>
void main()
{
	int a,b,c,x;
	printf("\n Enter Three Number:");
	x=scanf("%d %d %d",&a, &b ,&c);
	if(x==3)
	{
		printf("\n Addition : %d", a+b+c);
		printf("\n Multiplication :%d",a*b*c);
	}
}
