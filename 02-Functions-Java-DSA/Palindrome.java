import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.next();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    static boolean isPalindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return str.equals(rev);
    }
}
