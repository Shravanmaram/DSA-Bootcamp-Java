import java.util.*;
public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //one method returns true or false
//        boolean prim = prime(num);
//        System.out.println(prim);

        //another returns words
        if(isprime(num)){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not a prime");
        }

    }

    static boolean isprime(int num) {
        if(num<=1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
            }
        return true;
    }

    }


