import java.util.*;
public class SumAndPrdct {
    public static void main(String[] args) {
      SumAndProductOfDigit();
    }
    static void SumAndProductOfDigit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1= sc.nextInt();
        int sum=0;
        int product=1;
        int temp=n1;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }
        System.out.println("Result: "+(product-sum));
    }
}
