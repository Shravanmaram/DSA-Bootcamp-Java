import java.util.*;
public class SubOfProdAndSumOfDigts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int count=0;
        int sum=0;
        int product=1;
        int temp=num;
        while(temp>0){
           count =temp%10;
           sum+=count;
           product*=count;
           temp/=10;
        }
         int result=product-sum;
        System.out.println(result);
    }
}
