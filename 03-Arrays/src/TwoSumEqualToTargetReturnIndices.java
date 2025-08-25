//leetcode
import java.util.*;
public class TwoSumEqualToTargetReturnIndices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
        int[] result=TwoSum(arr,target);
        System.out.println("The indices are: "+Arrays.toString(result));

    }
    static int[] TwoSum(int arr[],int target){
        int[] result=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
