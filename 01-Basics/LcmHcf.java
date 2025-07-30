import java.util.*;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hcf=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        int Lcm=num1*num2/hcf;
        System.out.println("The Hcf of " +  num1 +" and " + num2 + " is :"+hcf);
        System.out.println("The Lcm of " +  num1 +" and " + num2 +" is :"+Lcm);
    }
}
