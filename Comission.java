import java.util.Scanner;
public class Comission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total sales: ");
        double sales=sc.nextDouble();
        System.out.print("The comission percentage: ");
        double compercent=sc.nextDouble();

        double comission=(compercent/100)*sales;
        System.out.println("The comission revieved: "+comission);
    }
}
