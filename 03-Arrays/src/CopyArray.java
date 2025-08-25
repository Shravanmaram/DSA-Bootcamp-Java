import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int cpy[]=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            cpy[j]=arr[j];
        }
        System.out.println("Original Array: "+Arrays.toString(cpy));
        System.out.println("Copied Array: "+Arrays.toString(cpy));
    }
}
