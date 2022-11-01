/*The Basic salary of an employee is 12000.
// WAP in Java to compute  Gross and Net Salary of that employee, 
// where HRA=15% and DA=110%, PF=12% */
class A2Q2 {
    public static void main(String[] args) {
        float basic = 12000;
        float hra = 0, da = 0, pf, gross = 0, net = 0;
        hra = (15 * basic) / 100;
        da = (40 * basic) / 100;
        pf = (12 * basic) / 100;
        gross = basic + hra + da;
        net = gross - pf;
        System.out.println("Gross Salary : " + gross);
        System.out.print("Net Salary : " + net);
    }
}
