//leetcode
import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row size of the matrix: ");
        int row=sc.nextInt();
        System.out.print("Enter the column size of the matrix: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int result=Sum(arr);
        System.out.println("The sum of diagonals: "+result);
    }
    static int Sum(int[][] arr){
        int sum=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            sum+=arr[i][n-1-i];
        }
        if(n%2==1){
            sum-=arr[n/2][n/2];
        }
        return sum;
    }
}
