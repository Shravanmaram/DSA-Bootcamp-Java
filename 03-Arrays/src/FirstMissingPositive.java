//Leetcode
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] Aray = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            Aray[i] = sc.nextInt();
        }
        int missingInteger= Missing(Aray);
        System.out.println("The first missing positive integer: "+missingInteger);
    }
    static int Missing(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;

            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
