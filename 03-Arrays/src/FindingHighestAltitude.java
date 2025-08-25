//Leetcode
import java.util.*;
public class FindingHighestAltitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] gain=new int[size];
        System.out.println("Enter the altitudes: ");
        for(int i=0;i<size;i++){
           gain[i]=sc.nextInt();
        }
        int max=netGain(gain);
        System.out.println("Highest altitude point is: "+max);

    }
    static int netGain(int[] gain){
        int altitude=0;
        int maxAltitude=0;
        for(int i=0;i<gain.length;i++){
            int g=gain[i];
            altitude+=g;
            if(altitude>maxAltitude){
                maxAltitude=altitude;
            }
        }
        return maxAltitude;
    }
}
