import java.security.Principal;

import javax.sound.midi.Soundbank;

//Declare the variable to set the value in principal time and rate of intrest. Display all the above information in details.
class Assignment7
    {
        public static void main(String args[])
        {
        float principal=10000;
        float rate=0.06F;
        double time=0.6;
        double intrest,amount;
        intrest=(principal*rate*time);
        amount=principal+intrest;
System.out.println("Principal amount of Loan Taken Rs."+principal);
System.out.println("Rate at which on the Loan has been Taken "+rate);
System.out.println("Time for which the amount has been taken "+time+" years.");
System.out.println("Intrest calculated on the "+intrest);
System.out.println("Amount total to be payed back "+amount);
        }

    }