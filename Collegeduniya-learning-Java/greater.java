
//To check weather the person is eligiable for the Voting (Adult)
import java.util.*;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Both the numbers are equals");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }

    }

}
