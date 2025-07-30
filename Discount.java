import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the original Price of the product: ");
            double original=sc.nextDouble();
        System.out.print("Enter the discount percentage of the product: ");
            double discount=sc.nextDouble();

             double dis=original*(discount/100);
             double fina=(original- dis);
        System.out.println("The total discount on the product: "+dis);
        System.out.println("Final price after discount: "+fina);


    }
}
