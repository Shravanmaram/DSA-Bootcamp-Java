import java.util.*;
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        if(palindrome(num)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    static boolean palindrome(int num){
        int pal=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
             pal=pal*10+digit;
             temp/=10;
        }
        return pal==num;
    }
}
