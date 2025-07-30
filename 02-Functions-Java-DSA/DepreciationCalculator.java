import java.util.*;
public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the salvage value: ");
        double salvage = sc.nextDouble();
        System.out.print("Enter the useful life (in years): ");
        int life = sc.nextInt();

        double depreciation = calculateDepreciation(cost, salvage, life);
        System.out.println("Annual Depreciation: " + depreciation);
    }

    static double calculateDepreciation(double cost, double salvage, int life) {
        return (cost - salvage) / life;
    }
}
