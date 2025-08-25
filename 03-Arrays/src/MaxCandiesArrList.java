// Leet code
import java.util.*;
public class MaxCandiesArrList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of kids with candies: ");
        int size=sc.nextInt();
        int[] candies=new int[size];
        System.out.println("Enter the candies each kid has: ");
        for(int i=0;i<size;i++){
            candies[i]=sc.nextInt();
        }
        System.out.println("Enter extra candies: ");
        int extraCandies=sc.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        // Output result
        System.out.println("Kids who can have the greatest candies: " + result);
    }
    static List<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        List<Boolean> result=new ArrayList<>();
        int maxCandies=0;
        for(int candy=0;candy<candies.length;candy++){
            if(candies[candy]>maxCandies){
              maxCandies= candies[candy];
            }
        }
        for(int candy=0;candy<candies.length;candy++){
            if(candies[candy]+extraCandies>=maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
