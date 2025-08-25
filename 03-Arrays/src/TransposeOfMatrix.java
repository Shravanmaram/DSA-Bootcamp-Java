//LeetCode
import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] result=Transpose(arr);
        System.out.print("Transpose of a matrix: "+Arrays.deepToString(result));
    }
    static int[][] Transpose(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        int[][] result=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[j][i]=arr[i][j];
            }
        }
        return  result;
    }
}
