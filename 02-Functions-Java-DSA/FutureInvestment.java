import java.util.*;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        double years = sc.nextDouble();

        System.out.print("Enter number of times interest compounded per year: ");
        int compoundFrequency = sc.nextInt();

        // Calculate future value
        double futureValue = calculateFutureValue(principal, annualRate, years, compoundFrequency);
        System.out.printf("Future Investment Value: ₹%.2f\n", futureValue);
    }

    static double calculateFutureValue(double P, double ratePercent, double time, int n) {
        double r = ratePercent / 100;
        return P * Math.pow(1 + r / n, n * time);
    }
}
