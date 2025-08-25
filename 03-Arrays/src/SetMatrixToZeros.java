import java.util.*;
public class SetMatrixToZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row size of the matrix: ");
        int row=sc.nextInt();
        System.out.print("Enter the row size of the matrix: ");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        MatrixToZero(matrix,row,col);
    }

    static void MatrixToZero(int[][] matrix, int m, int n){
        m= matrix.length;;
        n=matrix[0].length;
        boolean rowsetozero=false;
        boolean colsetozero=false;
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                rowsetozero=true;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                colsetozero=true;
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;

                }
            }
        }
        if(rowsetozero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(colsetozero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }

        System.out.println("The matrix after setting to zero is: ");
        for(int[] num:matrix){
            System.out.println(Arrays.toString(num));
        }
    }
}
