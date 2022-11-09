
// Take 2 variable and print the output of the sum entered by the user
import java.util.*;

public class input {
    public static void main(String args[]) {
        // Inp u t

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum of a & b is equals to : " + sum);
    }
}