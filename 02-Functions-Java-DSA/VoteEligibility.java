import java.util.*;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        Vote(age);

    }
    static void Vote(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
