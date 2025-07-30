import java.util.*;
public class Power {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base=sc.nextDouble();
        System.out.println("Enter the exponent: ");
       int exponent= sc.nextInt();
        double powe=pow(base,exponent);
        System.out.println("The power is: "+powe);
    }
    static double pow(double base,int exponent){
        double result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        if (exponent==0){
            return 1;
        }
        if (exponent < 0) {
            return 1.0 / result;
        } else {
            return result;
        }
    }
}
