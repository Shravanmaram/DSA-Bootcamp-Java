import java.util.*;
public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        System.out.print("Enter the value of r: ");
        int  r= sc.nextInt();

        if(r>n||n<0||r<0){
            System.out.println("Invalid");
            return;
        }
        long npr=Factorial(n)/(Factorial(n-r));
        long ncr=Factorial(n)/Factorial(r)*(Factorial(n-r));

        System.out.println("nCr (Combination) = " + ncr);
        System.out.println("nPr (Permutation) = " + npr);

    }
    static long Factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
