//Write a program to calculate the perimeter of the recatangle. Take the side a,b from the user.
#include<stdio.h>
int main()
{
    int length,breath;
    printf("Enter the value of the length and breath of the rectangle\n");
    scanf("%d%d",&length,&breath);
    printf("The area of the rectangle of the given value are: %d",length*breath);
    return 0;
}