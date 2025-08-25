//Leet code
import java.util.*;
public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the values in the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=CheckGoodPairs(arr);
        System.out.println("The number of good pairs from the array: "+result);
    }
    static int CheckGoodPairs(int[] arr){
        int goodpairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }
}
