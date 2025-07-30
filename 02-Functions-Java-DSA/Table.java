import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        Tab(num);
    }
    static void Tab(int num){
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }

    }
}
