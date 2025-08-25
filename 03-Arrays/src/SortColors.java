//Leetcode
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result=sort(arr);
        System.out.println("The array after sorting: "+Arrays.toString(result));
    }
    static int[] sort(int[] arr){
        int red=0,white=0,blue=0;
        for(int num: arr){
            if(num==0){
                red++;
            }else if(num==1){
                white++;
            }else{
                blue++;
            }
        }
        int index=0;
        for(int i=0;i<red;i++){
            arr[index++]=0;
        }
        for(int i=0;i<white;i++){
            arr[index++]=1;
        }
        for(int i=0;i<blue;i++){
            arr[index++]=2;
        }
        return arr;
    }
}
