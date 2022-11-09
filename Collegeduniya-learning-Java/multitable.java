
//Make a program that prints the table of a number that is input by the user. 
import java.util.*;

public class multitable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table is to be printed");
        int num = sc.nextInt();
        System.out.println("The table of the given number is as follows");
        System.out.println("1 * " + num + " = " + num * 1);
        System.out.println("2 * " + num + " = " + num * 2);
        System.out.println("3 * " + num + " = " + num * 3);
        System.out.println("4 * " + num + " = " + num * 4);
        System.out.println("5 * " + num + " = " + num * 5);
        System.out.println("6 * " + num + " = " + num * 6);
        System.out.println("7 * " + num + " = " + num * 7);
        System.out.println("8 * " + num + " = " + num * 8);
        System.out.println("9 * " + num + " = " + num * 9);
        System.out.println("10 * " + num + " = " + num * 10);
    }
}
