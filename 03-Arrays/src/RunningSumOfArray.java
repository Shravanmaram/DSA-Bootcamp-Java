//LEET CODE
import java.util.*;
public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=runningSum(arr);
        System.out.println("The running sum is: "+Arrays.toString(result));
    }
    static int[] runningSum(int[] arr){
        int[] runningSum=new int[arr.length];
        runningSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            runningSum[i]=runningSum[i-1]+arr[i];
        }
        return runningSum;
    }

}
