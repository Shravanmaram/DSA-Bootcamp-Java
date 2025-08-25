//LeetCode
import java.util.*;
public class NoOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in a sorted order: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=CountOfUniqueElements(arr);
        System.out.println("The no of unique elements in an array: "+result);

    }
    static int CountOfUniqueElements(int[] arr){
        int n=arr.length;
        if(n==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
