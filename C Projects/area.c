// Area of a Square amd Reactangle 
#include <stdio.h>
#include <conio.h>
int main()
{
    int a,l,b;
    float pi=3.14;
    printf("Enter the side of the square :");
    scanf("%d",&a);
    printf("The area of square: %d", a*a);
    printf("\nThe perimeter of square: %d",4*a);
    printf("\n\nEnter the side of the rectangle :");
    scanf("%d%d",&l,&b);
    printf("The area of a rectangle :%d",l*b);
    printf("\nThe perimetter of rectangle : %d",2*(l+b));
    getch();
}