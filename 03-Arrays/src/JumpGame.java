//Leetcode
import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the values in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if(jump(arr)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
       static boolean jump(int[] arr){
            int maxrange=0;
            for(int i=0;i<arr.length;i++){
                if(i>maxrange){
                    return false;
                }
                maxrange=Math.max(maxrange,i+arr[i]);
            }
            return true;
        }

        }
