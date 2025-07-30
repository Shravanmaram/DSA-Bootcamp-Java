import java.util.*;
class CurrencyConvrsn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the currency in Rupees: ");
        float rupee=sc.nextFloat();
        float usd=(rupee)/83;
        System.out.println("The usd of "+rupee+" is: $"+usd);
    }
}
//              we can use double instead of float