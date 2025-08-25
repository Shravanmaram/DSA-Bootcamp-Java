//Leetcode
import java.util.*;
public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrray: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int[] result=FindIndex(arr,target);
        System.out.println("The position of the first and last elements: "+Arrays.toString(result));
    }
    static int[] FindIndex(int[] arr,int target){
        int n=arr.length;
        int[] index=new int[]{-1,-1};
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                 index[0]=i;
                 break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                index[1]=i;
                break;
            }
        }
        return index;
    }
}
