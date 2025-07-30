import java.util.*;
public class AvgNnum {
    public static void main(String[] args) {
      int result= Average();
        System.out.println(result);
    }
    static int Average(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
       return sum/n;
    }
}

                 //void

/*import java.util.*;
public class AvgNnum {
    public static void main(String[] args) {
        Average();
    }

    static void Average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double avg = (double) sum / n;  // Cast to double for accurate average
        System.out.println("Average of first " + n + " numbers is: " + avg);
    }
}                                                                   */

