import java.util.*;
public class DistanceBtwnTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //coordinates of fist point
        System.out.print("Enter the first point coordinates: ");
        double x1=sc.nextDouble();
        double x2 =sc.nextDouble();


        //coordinates of second point
        System.out.print("Enter the second point coordinate: ");
        double y1=sc.nextDouble();
        double  y2 =sc.nextDouble();

        double distance=Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2-y1),2));
        System.out.println(distance);
    }
}
