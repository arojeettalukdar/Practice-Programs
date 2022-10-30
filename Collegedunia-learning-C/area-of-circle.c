// Write a program to calculate the area of the circle whose radius is given by the user
#include <stdio.h>
 int main()
{
    //area of circle(User defined Rdius)
    float radius;
    printf("Enter Radius of the Circle \n");
    scanf("%f",&radius);

    printf(" The area of the circle is: %f ",3.14 *radius* radius);
    return 0;
}