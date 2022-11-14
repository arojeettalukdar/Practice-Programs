
//To check weather the person is eligiable for the Voting (Adult)
import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber to be checked   ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }

}
