import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch>='a' && ch<='z'){
            //check for vowels
                     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                          System.out.println("Vowels");
                  }else {
                         System.out.println("Consonants");
                     }
        }else{
            System.out.println("Invalid input");
        }
    }
}
