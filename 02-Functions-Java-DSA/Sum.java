import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=add(num1,num2);
        System.out.println("The sum is: "+sum);


    }
    static int add(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
}
