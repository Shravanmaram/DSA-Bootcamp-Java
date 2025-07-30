import java.util.*;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year=sc.nextInt();
        if(CheckLeap(year)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
    static boolean CheckLeap(int year){
        if(year%400==0||year%4==0 && year%100!=0){
            return true;
        }else{
            return false;
        }

           // we can also write like this
        // return (year%400==0||year%4==0 && year%100!=0);
    }
}
