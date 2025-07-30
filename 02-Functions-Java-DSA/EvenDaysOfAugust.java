import java.util.*;
public class EvenDaysOfAugust {
    public static void main(String[] args) {
      main();
    }
    static void main(){
        int count=0;
        for(int i=2;i<=30;i++){
            if(i%2==0) {
                count++;
            }
        }
        System.out.println("Kunal allowed to go outside in "+count+" days in the month of august");
    }
}

//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.