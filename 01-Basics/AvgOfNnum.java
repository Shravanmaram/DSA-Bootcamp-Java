import java.util.*;
public class AvgOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        int sum = 0;


        //Average of N numbers
//        for(int i=1;i<=n;i++){
//            avg+=i;
//        }
//        System.out.println("The Average is: "+avg/n);
//
//    }
//}
        //custom input version
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the number " + i + ": ");
            int num = sc.nextInt();
            sum += i;
        }
        double avg = (double) sum / n;
        System.out.println("The Average is: " + avg);
    }
}