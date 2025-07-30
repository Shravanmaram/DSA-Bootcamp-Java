import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
     Bill();
    }
    static void Bill(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the units: ");
        double units=sc.nextDouble();
       double bill = 0;
        if(units<=100){
            bill= (units*1.5);
        }else if(units<=200){
            bill=100*1.5+(units-100)*2.5;
        }else if(units<=300){
            bill=100*1.5+200*2.5+(units-200)*3.5;
        }else if(units<=400){
            bill=100*1.5+200*2.5+300*3.5+(units-400)*4.5;
        }
        System.out.println("The electricity bill is: "+bill);
    }
}
