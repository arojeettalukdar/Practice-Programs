//Write a program to find the length of the string usinf printf() function
#include<stdio.h>
void main()
{
	char nm[20];
	int l;
	printf("Enter String :");
	scanf("%s",nm);
	l=printf(nm);
	printf("\nLength =%d",l);
}
