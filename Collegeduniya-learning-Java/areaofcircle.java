
/*Make a program that takes the radius of a circle as input,
// calculates its radius and area and prints it as output to the user */
import java.util.*;

class areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle to Find the area of the Circle");
        Float radius = sc.nextFloat();
        Double area = 3.14 * (radius * radius);
        System.out.println("The area of the Circle is : " + area);
    }
}
