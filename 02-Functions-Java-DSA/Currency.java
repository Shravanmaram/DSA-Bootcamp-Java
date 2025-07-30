import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the currency in rupees: ");
        float rupee=sc.nextFloat();
        dollars(rupee);

    }
    static void dollars(float rup){
        float dolor=rup/83f;
        System.out.println("currency in dollars: "+"$"+dolor);
    }
}
