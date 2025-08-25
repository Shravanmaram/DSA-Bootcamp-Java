// Leet code
import java.util.*;
public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] num =new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int[] result=Concat(num);
        System.out.println(Arrays.toString(result));

    }
    static int[] Concat(int num[]){
        int n=num.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=num[i];
            ans[i+n]=num[i];
        }
        return ans;

    }
}
