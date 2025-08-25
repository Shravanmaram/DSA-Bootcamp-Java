import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
//        int arr[]={1,5,3,8,7};

        //user input start
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int j=0;j<size;j++) {
            arr[j] = sc.nextInt();
        }
        //ends

        //logic is same
            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int i = 0; i <size; i++) {
                if (arr[i] > largest) {
                    second = largest;
                    largest = arr[i];
                } else if (arr[i] > second && arr[i] != largest) {
                    second = arr[i];
                }
            }

            if (second == Integer.MIN_VALUE)
                System.out.println("There is no largest number");
            else {
                System.out.println("The second largest number is: " + second);
            }


    }
}
