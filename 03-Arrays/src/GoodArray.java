//leetcode
import java.util.*;
public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the values in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int g=arr[0];
        for(int i=0;i<arr.length;i++){
           g= Gcd(g,arr[i]);
           if(g==1){
               System.out.println("true");
               return;
           }
        }
        System.out.println(g==1 ? true:false);
    }
    static int Gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
