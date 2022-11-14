
/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
* follows :
* 1 : + (Addition) a + b
* 2 : - (Subtraction) a - b
* 3 : * (Multiplication) a * b
* 4 : / (Division) a / b
* 5 : % (Modulo or remainder) a % b
* Calculate the result according to the operation given and display it to the
* user.
*/
import java.util.*;

public class cal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Action that to be displayed from 1 - 5");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                System.out.println("Addition of the two digit is : " + num1 + num2);
                break;
            }
            case 2: {
                System.out.println("Subtaction of the the two digit is : " + num1 + num2);
                break;
            }
            case 3: {
                System.out.println("Multiplied value is:" + num1 * num2);
                break;
            }
            case 4: {
                System.out.println("Divisable value is: " + num1 / num2);

                break;
            }
            case 5: {
                System.out.println("Modulus value is " + num1 % num2);
                break;
            }
            default: {
                System.out.println("Invalid Input !!!");
            }

        }
    }
}