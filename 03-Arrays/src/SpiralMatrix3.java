//Leetcode
import java.util.*;
public class SpiralMatrix3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int col=sc.nextInt();
        System.out.println("Enter the starting row: ");
        int rStart=sc.nextInt();
        System.out.println("Enter the starting column: ");
        int cStart=sc.nextInt();

        int[][] result=spiral(row,col,rStart,cStart);
        System.out.println("The spiral matrix is: "+Arrays.deepToString(result));
    }

    static int[][] spiral(int row,int col,int rStart,int cStart){
        int[][] result=new int[row*col][2];
        int count=0;
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int step=1;
        int r=rStart,c=cStart;
        result[count++]=new int[]{r,c};

        while (count<row*col){
            for(int d=0;d<4;d++){
                for(int i=0;i<step;i++){
                    r+=directions[d][0];
                    c+=directions[d][1];
                    if(r>=0 && r<row && c>=0 && c<col){
                        result[count++]=new int[]{r,c};
                    }
                }
                if(count==row*col){
                    return result;
                }
                if(d==1||d==3){
                    step++;
                }
            }

        }
        return result;
    }
}
