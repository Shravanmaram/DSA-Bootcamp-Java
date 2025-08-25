//leetcode
import java.util.*;
public class CheckingForEqualMatrixAfterRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n= sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] target = new int[n][n];
        System.out.println("Enter the elements in the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = sc.nextInt();
            }
        }
        boolean result=findRotation(mat,target);
        System.out.println(result);
    }
        static boolean findRotation(int[][] mat, int[][] target){
            //all 4 rotations 0,90,180,270
            for (int i = 0; i < 4; i++) {
                if (isSame(mat, target)) {
                    return true;
                }
                mat = rotate(mat);
            }
            return false;
        }
    static boolean isSame(int[][] a,int[][] b){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][] rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=mat[i][j];
            }
        }
        return rotated;
    }
}
