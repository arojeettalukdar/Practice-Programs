//Write a program to find the roots of a quadratic equations by using if-else statement condition
#include<stdio.h>
void main()
{
	int b,a,c;
	float x1,x2;

	printf("\n Enter Value for a,b,c :");
	scanf("%d %d %d", &a,&b,&c);
	if(b*b>4*a*c)
	{
		x1= -b+sqrt(b*b-4*a*c)/2*a;
		x2= -b-sqrt(b*b-4*a*c)/2*a;
		printf("\n x1=%f x2=%f",x1,x2);
	}
	else
		printf("\n Roots are Imaginary");
		getche();
}
