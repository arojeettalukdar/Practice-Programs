import javax.print.attribute.PrintServiceAttribute;

/* Define three seprate classes for the different geometric shapes such as circle, trianle and rectangle .
 * Define a variable in diffrent classes as per the requirement. Define the following methods in each of the defined classes
 * a) set required data in the variable 
 * b) calculate area of the shape and 
 * c) display the data of that shape
 * The corresponding classes are 
 * a) AreaOfCircle
 * b) AreaOfTriangle
 * c) AreaOfRectangle 
 * Determine the object whose area is highest if the 5cm is taken as unit for all the sides of all objects.
*/
class Assignment8
{
        void AreaOfCircle()
        {
            //A = \pi r^2
        float radius=5;
        double area;
        area=3.14159*radius;  // Value of Pi is 3.14159(constanst)
        System.out.println("Let us Assume the radius of the circle is 5 cm");
        System.out.println("The area of Circle is"+area);
        }
        void AreaOfTriangle()
        {
            //A=hbb
            System.out.println("Vanshita snehal");
            System.out.println("Let us assume the base of the triangle is 4 cm and height is 3cm");
                        double base=4.0,height=3.0;
                        double area=0.5*base*height;
            System.out.println("The area of the Triangle is "+area);
        }
        void AreaOfRectangle()
        {
            //Area
        }
        public static void main(String[] args)
         {
            Assignment8 obj =new Assignment8();
            obj.AreaOfCircle();
        }
}
