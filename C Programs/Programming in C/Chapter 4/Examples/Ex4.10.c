//Write a program to show the effects of various escape statement 
#include<stdio.h>
void main()
{
	int a=1,b=a+1,c=b+1,d=c+1;
	printf("\tA=%d\nB=%d \'C=%d'",a,b,c);
	printf("\n\b***\D=%d**",d);
	printf("\n*************");
	printf("\rA=%d B-%d",a,b);
}
