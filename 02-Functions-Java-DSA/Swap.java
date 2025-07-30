import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        swapping(n1,n2);
    }
    static void swapping(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping: ");
        System.out.println("First number: "+n1);
        System.out.println("second number: "+n2);
    }
}
