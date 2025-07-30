import java.util.*;
public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=0;
        int rev = 0;
        temp=num;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        if(rev==num){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        
    }
}
