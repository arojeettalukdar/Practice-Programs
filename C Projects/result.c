#include<stdio.h>
#include<conio.h>
{
    int m1,m2,m3,m4,m5,m6,total;
    char result,grade,name[15];
    float avg;
    printf("Enter student name :");
    scanf("%s",name);
    printf("\n Enter 6 marks :");
    scanf("%d%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5,&m6);
    total=m1+m2+m3+m4+m5+m6;
    avg=total/6;
    if(avg>40)
    {
        result='p';
        if(avg>75)
            grade='d';
        else if(avg>60 && avg<=75)
            grade='d';
        else if(avg>50 && avg<=60)
            grade='b';
        else 
            grade='c';
    }
    else
    result='f';
    printf("\nStudent name  :%s",name);
    printf("\nMarks         :");

    printf("\n%d\t%d\t%d\t%d\t%d\t%d\t",m1,m2,m3,m4,m5,m6);
    printf("\nAverage marks : %f",avg);
    if(result=='p')
        printf("\nResult        : pass");
    else
        printf("\nResult        : fail");
        printf("\nGrade         :%c",grade);
    getch();
}