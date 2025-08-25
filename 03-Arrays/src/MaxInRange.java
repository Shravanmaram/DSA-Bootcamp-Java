import java.util.*;
public class MaxInRange {
    public static void main(String[] args) {
        int arr[]={34,2,65,7,4,89,3};
        System.out.println("The max is: "+Max(arr,2,6));
    }
    static int Max(int arr[],int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
