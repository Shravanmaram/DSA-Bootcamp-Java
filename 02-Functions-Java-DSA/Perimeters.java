import java.util.Scanner;
public class Perimeters {
    public static void main(String[] args) {
     peri();

    }
    static void peri(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------ PERIMETER CALCULATOR ------");
        System.out.println("1. Perimeter of Circle");
        System.out.println("2. Perimeter of Equilateral Triangle");
        System.out.println("3. Perimeter of Parallelogram");
        System.out.println("4. Perimeter of Rectangle");
        System.out.println("5. Perimeter of Square");
        System.out.println("6. Perimeter of Rhombus");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circlePerimeter = 2 * Math.PI * r;
                System.out.println("Perimeter of Circle = " + circlePerimeter);
                break;

            case 2:
                System.out.print("Enter side length: ");
                double a1 = sc.nextDouble();
                System.out.println("Perimeter of Equilateral Triangle = " + (3 * a1));
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Perimeter of Parallelogram = " + (2 * (base + side)));
                break;

            case 4:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Perimeter of Rectangle = " + (2 * (length + width)));
                break;

            case 5:
                System.out.print("Enter side: ");
                double a2 = sc.nextDouble();
                System.out.println("Perimeter of Square = " + (4 * a2));
                break;

            case 6:
                System.out.print("Enter side: ");
                double a3 = sc.nextDouble();
                System.out.println("Perimeter of Rhombus = " + (4 * a3));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
