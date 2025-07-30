import java.util.*;
public class LargstNumUntil0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers to add and '0' to stop: ");
        int largest=Integer.MIN_VALUE;
        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }

        }
        System.out.println(largest);
    }
}
