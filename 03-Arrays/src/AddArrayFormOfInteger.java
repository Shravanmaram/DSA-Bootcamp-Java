//Leetcode
import java.util.*;
public class AddArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an arrray: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++ ){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the K (The elements to add) value: ");
        int k=sc.nextInt();
        List<Integer> result=ArrayForm(arr,k);
        System.out.println("Array after adding k: "+ (result));

    }
    static List<Integer> ArrayForm(int arr[],int k){
        List<Integer> result=new ArrayList<>();
        int i=arr.length-1;
        while(i>=0||k>0){
            if(i>=0){
                k+=arr[i--];
            }
            result.add(k%10);
            k/=10;
        }
        Collections.reverse(result);
        return result;
    }
}
