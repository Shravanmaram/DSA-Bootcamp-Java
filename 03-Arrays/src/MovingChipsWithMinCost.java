//Leetcode
import java.util.*;
public class MovingChipsWithMinCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the chips: ");
        int size=sc.nextInt();
        int[] position=new int[size];
        System.out.println("Enter the chips: ");
        for(int i=0;i<size;i++){
            position[i]=sc.nextInt();
        }
        int result=Chips(position);
        System.out.println("The least number of chips with minimum cost: "+result);
    }
    static int Chips(int[] position){
        int even=0,odd=0;
        for(int i:position){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }

}
