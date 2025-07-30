import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
            int num=sc.nextInt();
            int original=num;
            int sum=0;
            int count=0;

            //counting the number of digits
            int temp=num;
            while(temp>0){
                count++;
                temp/=10;                 // it removes each digit on  each iteration
            }

            //calculating the power of each digit in the number and adding to sum
            temp=num;
            while(temp>0){
                int digits=temp%10;         // it gives the last digit on each iteration
                sum+=Math.pow(digits,count);
                temp/=10;                  // it removes each digit on  each iteration

            }

            //checking for armstrong Number
            if(sum==original){
                System.out.println("It is Armstrong Number");
            }else{
                System.out.println("It is not a Armstrong Number");
            }



    }
}
