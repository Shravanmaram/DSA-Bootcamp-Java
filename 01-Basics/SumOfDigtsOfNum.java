import java.util.*;
public class SumOfDigtsOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        System.out.println("The sum of the digits of "+num+" is: "+sum);
    }
}
