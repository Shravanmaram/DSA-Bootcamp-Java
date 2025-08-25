import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {38, 5, 10, 7, 9};

        System.out.println("The max element is: " + (maximum(arr)));

    }

    static int maximum(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                arr[i]=max;
            }
        }
        return max;
        }
    }