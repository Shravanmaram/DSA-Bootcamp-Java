//leetcode
import java.util.*;
public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=Product(arr);
        System.out.println("The product is: "+Arrays.toString(result));
    }
    static int[] Product(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1] * arr[i-1];

        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix*=arr[i];
        }
        return result;
    }

}
