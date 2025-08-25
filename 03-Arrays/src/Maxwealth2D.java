//leet code
import java.util.*;
public class Maxwealth2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of bank accounts per customer: ");
        int cols = sc.nextInt();
        int[][] accounts =new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        int result=returnMaxWealth(accounts);
        System.out.println(result);

    }
    static int returnMaxWealth(int[][] accounts){
        int maxwealth=0;
        for(int i = 0; i< accounts.length; i++){
            int currentwealth=0;

            for(int j = 0; j< accounts[i].length; j++){
               currentwealth+=accounts[i][j];
            }
            if(currentwealth>maxwealth){
                maxwealth=currentwealth;
            }
        }
        return maxwealth;
    }
}
