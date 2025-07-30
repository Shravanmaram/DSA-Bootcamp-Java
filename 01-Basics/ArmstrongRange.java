//To find Armstrong Number between two given number.

import java.util.*;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end=sc.nextInt();

        System.out.println("The Armstrong numbers between "+ start +" and "+end+" are :" );

        for(int num=start;num<=end;num++) {
            int sum = 0;
            int original = num;

            int count = String.valueOf(num).length();

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }


            if (sum == original) {
                System.out.println(sum);
            }
        }

    }
}
