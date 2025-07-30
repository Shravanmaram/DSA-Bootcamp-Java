import java.util.*;
public class Discount {
    public static void main(String[] args) {
        double fprice=calDiscount();
        System.out.println("Final price: "+fprice);

    }
    static double calDiscount(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price: ");
        int price=sc.nextInt();
        System.out.print("Enter the discount: ");
        int discount=sc.nextInt();
        double tdis=(price*discount)/100;
        return price-tdis;
    }

}
