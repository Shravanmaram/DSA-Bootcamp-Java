import java.util.Scanner;
public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Isosceles Triangle");
        System.out.println("2. Parallelogram");
        System.out.println("3. Rhombus");
        System.out.println("4. Equilateral Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double area;

        switch (choice) {
            case 1:
                System.out.print("Enter base: ");
                double base1 = sc.nextDouble();
                System.out.print("Enter height: ");
                double height1 = sc.nextDouble();
                area = 0.5 * base1 * height1;
                System.out.println("Area of Isosceles Triangle: " + area);
                break;

            case 2:
                System.out.print("Enter base: ");
                double base2 = sc.nextDouble();
                System.out.print("Enter height: ");
                double height2 = sc.nextDouble();
                area = base2 * height2;
                System.out.println("Area of Parallelogram: " + area);
                break;

            case 3:
                System.out.print("Enter diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Enter diagonal 2: ");
                double d2 = sc.nextDouble();
                area = 0.5 * d1 * d2;
                System.out.println("Area of Rhombus: " + area);
                break;

            case 4:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                area = (Math.sqrt(3) / 4) * side * side;
                System.out.println("Area of Equilateral Triangle: " + area);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 to 4.");
        }
    }
}
