import java.util.*;

public class NvePveOddEvnSum {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int negativeSum = 0;
        int positiveOddSum = 0;
        int positiveEvenSum = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            } else if (num < 0) {
                negativeSum += num;
            } else {
                if (num % 2 == 0) {
                    positiveEvenSum += num;
                } else {
                    positiveOddSum += num;
                }
            }
        }

        System.out.println("\nSum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
    }
}
