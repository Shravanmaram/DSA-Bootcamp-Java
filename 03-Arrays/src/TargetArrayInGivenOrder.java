//Leet code
import java.util.*;
public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] index=new int[size];
        System.out.println("Enter the indexes: ");
        for(int i=0;i<size;i++){
            index[i]=sc.nextInt();
        }
        int[] result=InGivenOrder(arr,index);
        System.out.println("After updating and shifting array in the given order: "+Arrays.toString(result));

    }
    static int[] InGivenOrder(int[] arr,int[] index){
        int[] target=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int insertPos=index[i];

            for(int j=target.length-1;j>insertPos;j--){
                  target[j]=target[j-1];
            }
            target[insertPos]=arr[i];
        }
        return target;
    }

}
