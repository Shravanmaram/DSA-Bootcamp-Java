import java.util.*;
public class Volumes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select a shape to calculate its volume: ");
        System.out.println("1.Volume of cone ");
        System.out.println("2.Volume of Prism ");
        System.out.println("3.Volume of cylinder ");
        System.out.println("4.Volume of sphere ");
        System.out.println("5.Volume of pyramid ");
        System.out.print("Enter your choice(1-5): ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the radius: ");
                double radius=sc.nextDouble();
                double Vol=0.3*radius*radius;
                System.out.println("volume of Cone is: "+Vol);
                break;

            case 2:
                System.out.print("Enter the base: ");
                double base=sc.nextDouble();
                System.out.print("Enter the height: ");
                double height=sc.nextDouble();
                double vol=base*height;
                System.out.println("Volume of prism: "+vol);
                break;

            case 3:
                System.out.print("Enter the radius: ");
                double ra=sc.nextDouble();
                System.out.print("Enter the height: ");
                double h= sc.nextDouble();
                double v=Math.PI*ra*ra*h;
                System.out.println("Volume of cylinder: "+v);
                break;
            case 4:
                System.out.print("Enter the radius: ");
                double r=sc.nextDouble();
                double volu=(1.3)*Math.PI*r*r;
                System.out.println("Volume of sphere: "+volu);
                break;

            case 5:
                System.out.print("Enter the base: ");
                double b=sc.nextDouble();
                System.out.print("Enter the height: ");
                double hei=sc.nextDouble();
                double V=(0.3)*b*hei;
                System.out.println("Volume of prism: "+V);
                break;

            default:
                System.out.println("Invalid choice! please select from 1-5 only");



        }

    }
}
