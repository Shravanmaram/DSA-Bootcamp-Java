// Take inputs of numbers as long as the user enter the x or X then stop and return the sum of numbers
import java.util.*;
public class Stop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter Number to add and x or X to stop: ");
        while(true){
          if(sc.hasNextInt()) {
              int num = sc.nextInt();
              sum += num;
          }else{
              String input=sc.next();
              if(input.equalsIgnoreCase("x")){
//                  System.out.println("Sum ="+sum);
                  break;
              }else{
                  System.out.println("Invalid Input");
              }
          }
        }
        System.out.println("Sum ="+sum);

    }
}
