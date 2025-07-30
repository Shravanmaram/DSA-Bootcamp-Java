import java.util.*;
public class Stopwn0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any number to continue and '0' to stop: ");
        while(true){
            int num=sc.nextInt();
            if(num==0) {
                break;
            }
                sum+=num;
            }
        System.out.println(sum);
        }


    }

