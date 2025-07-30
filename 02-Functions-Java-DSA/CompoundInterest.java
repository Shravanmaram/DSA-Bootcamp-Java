import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter the time in years: ");
        double t = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year (N): ");
        int n = sc.nextInt();

        double amount = calCompoundInterest(p, t, r, n);
        double ci = amount - p;

        System.out.printf("The Compound Interest is: %.2f%n", ci);
        System.out.printf("Total Amount after Interest: %.2f%n", amount);
    }

    static double calCompoundInterest(double p, double t, double r, int n) {
        return p * Math.pow((1 + r / (100 * n)), n * t);
    }
}
