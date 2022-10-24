/* The basic salary of an employee is 12000. Write a program in Java to compute gross and net salary of 
 * of that employee where HRA=15%, DA=110%, PF=12% */

 class assignment6
 {
    public static void main(String args[])
    {
        // Gross salary = Basic Salary + HRA + Other Allowances
        //Net Salary=Net Salary = Gross salary – All deductions like income tax, pension, professional tax, etc.
       float basic = 12000;
        float hra= 0, da=0, pf=0, gross=0, net=0;
        hra= (15*basic)/100;
        da=(110*basic)/100;
        pf=(12*basic)/100;
        gross=basic+hra+da;
        net=gross-pf;
        System.out.println("Gross Salary "+gross);
        System.out.println("Net Salary "+net);

    }
 }