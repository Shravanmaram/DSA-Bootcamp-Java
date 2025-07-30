import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;

        }
    }
}
