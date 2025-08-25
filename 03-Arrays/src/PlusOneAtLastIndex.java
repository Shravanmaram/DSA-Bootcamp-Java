//LeetCode
import java.util.*;
public class PlusOneAtLastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] digits=new int[size];
        System.out.println("Enter the digits in the array: ");
        for(int i=0;i<size;i++){
            digits[i]=sc.nextInt();
        }
        int[] result=PlusOne(digits);
        System.out.println("The array after adding plus on at last index is: "+Arrays.toString(result));

    }
    static int[] PlusOne(int[] digits){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[n+1];
        result[0]=1;
        return result;
    }
}
