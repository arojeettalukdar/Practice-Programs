#include<stdio.h>
#include<conio.h>
int main()
{
    int basic, insure, gross, net;
    float da,hra,pf;
    printf("Enter basic salary :");
    scanf("%d",&basic);
    da=basic*0.20;
    hra=basic*0.20;
    gross=basic*0.15;
    gross=basic+da+hra;
    insure=500;
    pf=basic*0.12;
    net=gross-(insure+pf);
    printf("\nBasic salary          :%d",basic);
    printf("\nDearness allowence    :%f",da);
    printf("\nHRA                   :%f",hra);
    printf("\nInsurence             :%d",insure);
    printf("\nProvident Fund        :%f",pf);
    printf("\nGross salary          :%d",gross);
    printf("\nNet salary            :%d",net);
    getch();
}