import java.util.*;

public class greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an option 1-3 for the greetings");
        int button = sc.nextInt();
        /*
         * if (button == 1) {
         * System.out.println("Hello");
         * } else if (button == 2) {
         * System.out.println("Namaste");
         * } else if (button == 3) {
         * System.out.println("Bonjour");
         * } else {
         * System.out.println("Invalid Button Pressed !!!");
         * }
         */
        switch (button) {
            case 1: {
                System.out.println("Hello");
                break;
            }
            case 2: {
                System.out.println("Namaste");
                break;
            }
            case 3: {
                System.out.println("Bonjour");
                break;
            }
            default: {
                System.out.println("Pressed Invalid Key !!");
            }

        }
    }
}