import java.util.*;
public class InputUnitlUser0 {
    public static void main(String[] args) {
        Until0();
    }
    static void Until0(){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any number: ");
        while(true){
                int n=sc.nextInt();
                if(n==0) {
                    break;
                }
                sum += n;
            
        }
        System.out.println("sum: "+sum);
    }
}
