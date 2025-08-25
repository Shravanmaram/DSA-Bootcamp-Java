//Leet code
import java.util.*;
public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n= size/2;
        int[] result=Shuffle(arr,n);
        System.out.println("After shuffling: "+Arrays.toString(result));



    }
    static int[] Shuffle(int[] arr,int n){
        int[] shuffle=new int[n*2];
        int index=0;
        for(int i=0;i<n;i++){
            shuffle[index++]=arr[i];
            shuffle[index++]=arr[i+n];
        }
        return shuffle;
    }
}
