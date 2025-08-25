//Leetcode
import java.util.*;
public class Roberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result=returnMaxMoney(arr);
        System.out.println("The maximum money from the roberry: "+result);
    }
    static int returnMaxMoney(int[] arr){
        int n=arr.length;
        if(n==0){
            return 0;
        }else if(n==1){
            return arr[0];
        }
        int prevRob=arr[0];
        int prevSkip=0;
        for(int i=1;i<n;i++){
            int newRob=prevSkip+arr[i];
            int newSkip=Math.max(prevSkip,prevRob);
            prevRob=newRob;
            prevSkip=newSkip;

        }
        return Math.max(prevRob,prevRob);
    }
}
