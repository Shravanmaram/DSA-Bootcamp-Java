//Leetcode
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to check for pangram or not: ");
        String sentence=sc.nextLine();
       if( CheckIfPangram(sentence)){
           System.out.println("pangram");
       }else{
           System.out.println("not a pangram");
       }
    }
    static boolean CheckIfPangram(String sentence){
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
