
/*
 * Ask the user to enter the number of the month & print the name of the month.
 * For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
 */
import java.util.*;

public class calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the month number");
        int mon = sc.nextInt();
        switch (mon) {
            case 1: {
                System.out.println("January is the month");
                break;
            }
            case 2: {
                System.out.println("Feburary is the month");
                break;
            }
            case 3: {
                System.out.println("March is the month");
                break;
            }
            case 4: {
                System.out.println("April is the month");
                break;
            }
            case 5: {
                System.out.println("May is the month");
                break;
            }
            case 6: {
                System.out.println("June is the month");
                break;
            }
            case 7: {
                System.out.println("July is the month");
                break;
            }
            case 8: {
                System.out.println("August is the month");
                break;
            }
            case 9: {
                System.out.println("September is the month");
                break;
            }
            case 10: {
                System.out.println("October is the month");
                break;
            }
            case 11: {
                System.out.println("November is the month");
                break;
            }
            case 12: {
                System.out.println("December is the month");
                break;
            }
        }
    }
}