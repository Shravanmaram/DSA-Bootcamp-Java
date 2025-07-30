import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  String: ");
        String str=sc.next();
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}
