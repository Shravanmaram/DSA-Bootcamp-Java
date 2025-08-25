//Leetcode
import java.util.*;
public class CountEvenNoOfDigtsOfANumInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=EvenCount(arr);
        System.out.println("The numbers with even number of digits in an array: "+result);

    }
    static int EvenCount(int[] arr){
        int count=0;
        int n=arr.length;
        for(int num=0;num<n;num++){
            int digitCount=0;
            int temp=arr[num];
            while(temp>0){
                temp/=10;
                digitCount++;
            }
            if(digitCount%2==0){
                count++;
            }
        }
        return count;
    }
}
