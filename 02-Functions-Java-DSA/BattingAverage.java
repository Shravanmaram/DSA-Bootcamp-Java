import java.util.*;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of times out: ");
        int outs = sc.nextInt();

        double average = calculateBattingAverage(runs, outs);
        System.out.println("Batting Average: " + average);
    }

    static double calculateBattingAverage(int runs, int outs) {
        if (outs == 0) {
            return runs; // if never out
        } else {
            return (double) runs / outs;
        }
    }
}
