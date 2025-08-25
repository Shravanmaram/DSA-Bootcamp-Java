//Leet code
import java.util.*;
public class FlippingAnImage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of the row: ");
        int col=sc.nextInt();
        int[][] image=new int[row][col];
        System.out.println("Enter the image coordinates: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                image[i][j]=sc.nextInt();
            }
        }
        int result[][]=FlippedImage(image);
        System.out.println("Image after flipping: "+Arrays.deepToString(result));

    }
    static int[][] FlippedImage(int[][] image){
        int row= image.length;
        int col=image[0].length;
        int[][] reverse=new int[row][col];
        int[][] flip=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                reverse[i][j]=image[i][col - 1 - j];
                if(reverse[i][j]==0){
                    flip[i][j]=1;
                }else{
                    flip[i][j]=0;
                }
            }
        }
        return flip;

    }
}
