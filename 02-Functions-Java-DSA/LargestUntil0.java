import java.util.*;
public class LargestUntil0 {
    public static void main(String[] args) {
        Largest();
    }

    static void Largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int max = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("max is: " + max);
    }
}