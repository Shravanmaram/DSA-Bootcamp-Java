import java.util.*;
public class SumOfNvePveOddEvnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumn = 0;
        int sump = 0;
        int sumo = 0;

        while(true) {
            System.out.println("Enter numbers to take inputs and '0' to stop: ");
            int num = sc.nextInt();
            if(num==0){
                break;
                }else if (num < 0) {
                        sumn += num;
                    } else if ( num % 2 == 0) {
                        sump += num;
                    }else if (num % 2 != 0) {
                        sumo += num;
                    }
        }
        System.out.println("The sum of negative  numbers is: " + sumn);
        System.out.println("The sum of positive even numbers is: " + sump);
        System.out.println("The sum of positive odd numbers is: " + sumo);
    }
}
