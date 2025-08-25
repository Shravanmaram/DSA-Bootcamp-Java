//Leetcode
import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row size of the array: ");
        int row=sc.nextInt();
        System.out.print("Enter the column size of the array: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        List<Integer> result=Lucky(arr);
        System.out.println("The Luck number(Minimum in the row and maximum in the column) is: "+result);
    }
    static List<Integer> Lucky(int[][] arr){
        List<Integer> result=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            int min=arr[i][0];
            int col=0;
            for(int j=1;j<n;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    col=j;
                }
            }
            boolean isLucky=true;
            for(int k=0;k<m;k++){
                if(arr[k][col]>min){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky){
                result.add(min);
            }
        }
        return result;
    }
}
