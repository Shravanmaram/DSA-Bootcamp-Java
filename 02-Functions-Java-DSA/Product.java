import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int multi=add(num1,num2);
        System.out.println("The sum is: "+multi);


    }
    static int add(int num1,int num2){
        int multi=num1*num2;
        return multi;
    }
}

