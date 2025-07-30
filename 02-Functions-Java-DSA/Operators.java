import java.util.*;
public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the operator : ");
        char op=sc.next().trim().charAt(0);
        int calci=calculator(num1,num2,op);
        System.out.println("result: "+calci);

    }
    static int calculator(int num1,int num2,char op) {
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                return num1 / num2;
            }else {
                System.out.println("Error: Cannot divide by zero");
                return 0;
            }
        } else {
            System.out.println("Invalid operator");
        }
        return 0;

    }
}
