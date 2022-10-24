#include<stdio.h>
void main()
{
	float bs,hra,da,cv,incentive,bonus,sale,ts;
	printf("Enter Total Sales in Rs.:");
	scanf("%f",&sale);
	if(sale>=100000)
	{
		bs=3000;
		hra=20*bs/100;
		da=110*bs/100;
		cv=500;
		incentive=sale*10/100;
		bonus=500;
	}
	else
	{
		bs=3000;
		hra=20*bs/100;
		da=110*bs/100;
		cv=500;
		incentive=sale*5/100;
		bonus=200;
	}
	ts=bs+hra+da+cv+incentive+bonus;
	printf("\nTotal Sales: %.2f",sale);
	printf("\nBasic Salary: %.2f",bs);
	printf("\nHRA: %.2f",hra);
	printf("\nDA: %.2f",da);
	printf("\nConveyance: %.2f",cv);
	printf("\nBonus: %.2f",bonus);
	printf("\nGross Salary: %.2f",ts);
	getch();
	
}
