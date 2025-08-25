//leet code
import java.util.*;
public class SpiralMatrix2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n=sc.nextInt();
        int[][] result=Spiral(n);
        System.out.println("The spiral matrix is: ");
        for(int[] row: result){
            System.out.println(Arrays.toString(row));
        }

    }

    static int[][] Spiral(int n){
        int[][] result=new int[n][n];
        int num=1;
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        while (top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                result[top][i]=num++;
            }
            top++;

            for(int j=top;j<=bottom;j++){
                result[j][right]=num++;
            }
            right--;

            for(int i=right;i>=left;i--){
                result[bottom][i]=num++;
            }
            bottom--;

            for(int j = bottom; j >=top; j--){
                result[j][left]=num++;
            }
            left++;
        }
        return result;
    }
}