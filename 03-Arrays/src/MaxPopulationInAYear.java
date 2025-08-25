//leetcode
import java.util.*;
public class MaxPopulationInAYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the births and death years between 1950 to 2050: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxyear=MaxPopYear(arr);
        System.out.println("Maximum populated year is: "+maxyear);
    }
    static int MaxPopYear(int[][] arr){
        int[] population=new int[101]; //size frm 1950 to 2050
        for(int[] yea:arr){
            int birth=yea[0];
            int death=yea[1];
            population[birth-1950]++;
            population[death-1950]--;
        }
        int maxpop=0;
        int currpop=0;
        int year=1950;
        for(int i=0;i<101;i++){
            currpop+=population[i];    //population gets the difference array like[1,-1,2,2,-2,0...]from fist for loop
            if(currpop>maxpop){
                maxpop=currpop;
                year=1950+i;
            }
        }
        return year;
    }
}

