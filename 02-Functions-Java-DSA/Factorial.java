
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int ans=fact(num);
        System.out.println("Factorial of "+num+" is: "+ans);
    }
    static int fact(int num){
        int fac =1;
            for(int i=2;i<=num;i++){
                fac *=i;
            }
            return fac;
    }
}


           //use BigInteger for larger values
