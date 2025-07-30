import java.util.*;
public class TakeInputsUnitI {
    public static void main(String[] args) {
        int sum=Stop();
        System.out.println("The sum is: "+sum);

    }
    static int Stop(){
            Scanner sc=new Scanner(System.in);
            int sum=0;
            System.out.println("Enter numbers to continue x to stop: ");
            while(true){
                if(sc.hasNextInt()){
                    int n=sc.nextInt();
                    sum+=n;
                }else{
                    String str=sc.next();
                    if(str.equalsIgnoreCase("x")){
                        break;
                    }
                }
            }
            return sum;
    }
}







                                 //simple method

/* import java.util.*;
public class TakeinptsUnitIx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter numbers to continue x to stop: ");
        while(true){
            if(sc.hasNextInt()){
                int n=sc.nextInt();
                sum+=n;


            }else{
                String str=sc.next();
                if(str.equalsIgnoreCase("x")){
                    break;
                }
            }

        }
        System.out.println("sum is: "+sum);

    }
}                           */

