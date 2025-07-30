import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        Fib(n);

    }
    static void Fib(int n){
        int a=0;
        int b=1;
        System.out.println("The fibonacci series is: ");
        for(int i=1;i<=n;i++) {
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
