import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Mini Project
        Scanner sc =new Scanner(System.in);
        int myNumber =(int)(Math.random()*100);
        int userNumber;
        do {
            System.out.println("Guess my Number (1-100)");
            userNumber= sc.nextInt();

            if(userNumber==myNumber)
            {
                System.out.println("WOOHOO....Correct Number");
                break;
            }
            else if (userNumber>myNumber)
            {
                System.out.println("your number is large");
            }
            else
            {
                System.out.println("your number is small");
            }
        } while (userNumber >=0);

        System.out.println("My Number was");
        System.out.println(myNumber);
    }
}