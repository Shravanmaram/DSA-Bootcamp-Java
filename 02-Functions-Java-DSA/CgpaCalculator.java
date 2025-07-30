import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int subjectCount = sc.nextInt();

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= subjectCount; i++) {
            System.out.println("Subject " + i + ":");

            int credits = getCredits(sc);
            int gradePoint = getGradePoint(sc);

            totalGradePoints += credits * gradePoint;
            totalCredits += credits;
        }

        double cgpa = calculateCGPA(totalGradePoints, totalCredits);
        double percentage = calculatePercentage(cgpa);

        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.printf("Percentage (JNTU formula): %.2f%%\n", percentage);
    }

    // Method to get credits from user
    static int getCredits(Scanner sc) {
        System.out.print("Enter credits: ");
        return sc.nextInt();
    }

    // Method to get grade points from user
    static int getGradePoint(Scanner sc) {
        System.out.print("Enter grade point (out of 10): ");
        return sc.nextInt();
    }

    // Method to calculate CGPA
    static double calculateCGPA(double totalPoints, int totalCredits) {
        return totalPoints / totalCredits;
    }

    // Method to calculate percentage (JNTU rule: (CGPA - 0.75) * 10)
    static double calculatePercentage(double cgpa) {
        return (cgpa - 0.75) * 10;
    }
}
