
//To check weather the person is eligiable for the Voting (Adult)
import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Person");
        int age = sc.nextInt();
        if (age > 17) {
            System.out.println("Eligiable to Vote");
        } else {
            System.out.println("Not Eligoable to Vote");
        }

    }

}
