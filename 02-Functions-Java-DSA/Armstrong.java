import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        if(CheckArmstrong(num)){
            System.out.println(num+" is Armstrong");
        }else{
            System.out.println(num+" is not an Armstrong");
        }
    }
    static boolean CheckArmstrong(int num){
        int original=num;
        int sum=0;
        int count=0;

        //counting the digits
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }

        //calculating the armstrong number
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        return sum==original;
    }
}