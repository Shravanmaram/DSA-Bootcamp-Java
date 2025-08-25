//Leetcode
import java.util.*;
public class CellsWithOddValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows of array: ");
        int m =sc.nextInt();
        System.out.println("Enter the no of columns of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the no of operations: ");
        int k=sc.nextInt();
        int[][] indices =new int[k][2];
        System.out.println("Enter the elements of each row and column the array: ");
        for(int i=0;i<k;i++) {
                indices[i][0]=sc.nextInt();
                indices[i][1]=sc.nextInt();
            }
        int result=OddCount(m,n,indices);
        System.out.println("Odd count = "+result);
        }
        static int OddCount(int m,int n,int[][] indices){
        int[] rows=new int[m];
        int[] col=new int[n];
        for (int i=0;i< indices.length;i++){
            int rowindex=indices[i][0];
            int colindex=indices[i][1];
            rows[rowindex]++;
            col[colindex]++;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rows[i]+col[j])%2!=0){
                    count++;
                }
            }
        }
        return  count;


    }
}
