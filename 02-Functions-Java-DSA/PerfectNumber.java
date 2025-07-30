import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        if(perfect()){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
    static boolean perfect(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0) {
                sum += i;
            }
        }
        return sum==original;
    }
}
