import java.util.*;
public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the operator: ");
        char op=sc.next().trim().charAt(0);
        if(op=='+'){
            System.out.println(num1+num2);
        }else if(op=='-'){
            System.out.println(num1-num2);

        }else if(op=='*') {
            System.out.println(num1 * num2);
        } else if(op=='/'){
                System.out.println(num1/num2);

        }else{
            System.out.println("Not an operator");
        }

    }
}
