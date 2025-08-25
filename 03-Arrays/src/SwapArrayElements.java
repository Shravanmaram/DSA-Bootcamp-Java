import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,7};
        swap(arr,0,3);
        System.out.println("After swapping: "+ Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
