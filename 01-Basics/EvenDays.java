import java.util.*;
public class EvenDays {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }

        }
        System.out.println("kunal can go out to play "+count+" days in August");
    }
}
