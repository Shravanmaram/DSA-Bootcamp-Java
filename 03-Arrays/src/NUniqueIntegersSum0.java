//leetcode
import java.util.*;
public class NUniqueIntegersSum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of unique elements: ");
        int n=sc.nextInt();
        int[] result=SumUpToZero(n);
        System.out.println("The unique elements are: "+Arrays.toString(result));

    }
    static int[] SumUpToZero(int n){
        int[] arr=new int[n];
        int index=0;
        for(int i=1;i<=n/2;i++){
            arr[index++]=-i;
            arr[index++]=i;
        }
        if(n%2==1){
            arr[index]=0;
        }
        return arr;
    }
}
