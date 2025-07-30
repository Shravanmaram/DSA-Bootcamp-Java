import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal: ");
        float principal=sc.nextFloat();
        System.out.print("Enter Time: ");
        float time=sc.nextFloat();
        System.out.print("Enter Rate: ");
        float rate=sc.nextFloat();
        float ptr=(principal*time*rate)/100;
        System.out.println("Simple Intrest: "+ptr);
    }
}
