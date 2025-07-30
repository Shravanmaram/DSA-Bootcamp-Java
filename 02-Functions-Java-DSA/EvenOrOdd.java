import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        EvenOrOdd(n);

    }

        static void EvenOrOdd(int n){
            if (n % 2 != 0) {
                System.out.println("odd");
            }else{
                System.out.println("Even");

            }
        }

}