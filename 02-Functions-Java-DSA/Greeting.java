import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        Greet(name);

    }
    static void Greet(String name){
        System.out.println("Hello "+name);
    }
}
