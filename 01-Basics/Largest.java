import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is the largest number");
        }else if(num2>num1){
            System.out.println(num2+" is the largest number");
        }else{
            System.out.println("Both are equal");
        }

    }
}
