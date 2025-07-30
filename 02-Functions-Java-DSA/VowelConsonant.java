import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        CheckVowelorConsonant();

    }
    static void CheckVowelorConsonant(){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character: ");
         char ch=sc.next().trim().charAt(0);
         ch=Character.toLowerCase(ch);
         if(ch>='a'&&ch<='z'){
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 System.out.println("vowels");
             }else {
                 System.out.println("Consonants");
             }
         }else{
             System.out.println(" Please enter the character");
         }
    }
}
