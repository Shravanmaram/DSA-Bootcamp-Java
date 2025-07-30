import java.util.*;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        CheckArmstrong(start,end);
    }
    static void CheckArmstrong(int start,int end){
        for(int i=start;i<=end;i++){
            int original=i;
            int sum=0;
            int count=0;

            int temp=i;
            while(temp>0){
                count++;
                temp/=10;
            }

            temp=i;
            while(temp>0){
                int digit=temp%10;
                sum+=Math.pow(digit,count);
                temp/=10;
            }

            if(original==sum){
                System.out.print(i+" ");
            }
        }
    }
}
