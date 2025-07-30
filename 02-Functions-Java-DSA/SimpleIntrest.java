import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double t=sc.nextDouble();
        System.out.print("Enter the rate of intrest: ");
        double r=sc.nextDouble();
        double sim= calsimpintest(p,t,r);
        System.out.println("The simple intrest: "+sim);


    }
    static double calsimpintest(double p,double t,double r){

        return (p*t*r)/100;
    }
}
