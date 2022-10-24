//To Find the Biggest Number out of Three Networks
#include <stdio.h>
#include <conio.h>
int main()
{
    int a,b,c;
    printf("Enter any three Number:\n");
    scanf("%d%d%d",&a,&b,&c);
    if((a>b)&&(a>c))
        printf("The big Number:%d",a);
    else if(b>c)
        printf("The big Number:%d",b);
    else
        printf("The biggest Number is :%d",c);
    getch();
}