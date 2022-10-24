// Write a program to demonstate the use of the scanf() with different formats 
#include<stdio.h>
void main()
{
	int a,b;
	float x;
	 char name[20];
	 printf("Enter two integer:-\n");
	 scanf("%4d %4d",&a,&b);
	 printf("\nEntered integer are:");
	 printf("\n%4d %4d",a,b);
	 printf("\n");
	 printf("\nEnter a real number:-\n");
	 scanf("%f",&x);
	 printf("\n Entered float number is ");
	 printf("\n%f",x);
	 printf("\n");
	 printf("\nEnter a String :-\n");
	 printf("%7s",name);
	 printf("\nEntered String");
	 printf("\n%7s",name);
	 getche();
}
