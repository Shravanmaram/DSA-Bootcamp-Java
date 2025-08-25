//leetcode
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        List<Integer> result=Spiral(arr);
        System.out.println("The spiral Matrix is: "+result);
    }
    static List<Integer> Spiral(int[][] arr){
        List<Integer> result=new ArrayList<>();
        int top=0,bottom= arr.length-1;
        int left=0,right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(arr[top][i]);
            }
            top++;
            for(int j=top;j<=right;j++){
                result.add(arr[j][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    result.add(arr[j][left]);
                }
                left++;
            }
        }
        return result;
    }
}
