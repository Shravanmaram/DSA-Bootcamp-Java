import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if((year%400==0)||( year%4==0 && year%100!=0)) {
            System.out.println("The " + year + " is leap year.");
        }else{
                System.out.println("The "+year+" is not a leap year.");
        }
    }
}
