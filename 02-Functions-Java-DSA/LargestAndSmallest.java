/*import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter Third number: ");
        int c=sc.nextInt();

        int largest=largest(a,b,c);
        int smallest=smallest(a,b,c);
        System.out.println("Largest: "+largest);
        System.out.println("smallest: "+smallest);


    }
    static int largest(int a, int b, int c){
        if(a>b&&a>c){
            return a;
        } else if (b>a&&b>c) {
            return b;
        }else{
            return c;
        }
    }
    static int smallest(int a,int b,int c){
        if(a<b && a<c){
            return a;
        } else if (b<a&&b<c) {
            return b;

        }else{
            return c;
        }
    }
}                                      */

               //2nd method


import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

        int largest = largest(a, b, c);
        int smallest = smallest(a, b, c);
        System.out.println("Largest: " + largest);
        System.out.println("smallest: " + smallest);



    }

    static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int smallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}

