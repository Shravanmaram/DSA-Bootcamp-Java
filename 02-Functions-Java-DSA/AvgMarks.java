import java.util.*;
public class AvgMarks {
    public static void main(String[] args) {
      Marks();
    }
    static void Marks(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no of subjects: ");
        int total=sc.nextInt();
        int sum=0;
        System.out.println("Enter the marks: ");
        for(int i=0;i<total;i++){
            int marks=sc.nextInt();
            sum+=marks;
        }
        System.out.println("Average marks: "+(sum/total));

    }
}
