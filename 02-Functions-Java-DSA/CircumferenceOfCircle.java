import java.util.*;
public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double circum=circumference(radius);
        System.out.println("The circumference of a circle is: "+circum);

    }
    static double circumference(double radius){
        double circum=2*Math.PI*radius;
        return circum;

    }
}
