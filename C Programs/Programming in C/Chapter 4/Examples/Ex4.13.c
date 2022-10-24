//Write a program to detect a error while inputting a data .Use return value of scanf() statement.
#include<stdio.h>
void main()
{
	int a,b,c,v;
	printf("Enter the value of 'A','B',& 'C' :");
	v=scanf("%d %d %d", &a,&b,&c);
	(v<3 ? printf("\nError in Inputting.") : printf("\n Values Successfully read"));
}
