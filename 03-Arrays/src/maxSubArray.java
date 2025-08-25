//leetcode
import java.util.*;
public class maxSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=MaxSub(arr);
        System.out.println("The max sum subArray: "+result);
    }
    static int MaxSub(int arr[]){
        int maxsum=arr[0];
        int currentmaxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentmaxsum=Math.max(arr[i],currentmaxsum+arr[i]);
            maxsum=Math.max(maxsum,currentmaxsum);
        }
        return maxsum;
    }
}
