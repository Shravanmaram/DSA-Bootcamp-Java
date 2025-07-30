import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Fact();
    }
    static void Fact(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The factors of "+n+ " are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
