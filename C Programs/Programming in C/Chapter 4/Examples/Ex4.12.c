//Write a program to print the third power of 10 using pow10() function.Assume the floating point number.
#include<math.h>
#include<stdio.h>
void main()
{
	int p=3;
	printf("Ten raised to %lf is %lf\n",p,pow(10,p));//The %lf is showing 0.0000 whereas desired answer 3.00000 *(error)
}

