import java.util.*;

import static java.util.GregorianCalendar.BC;

public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
       String grade= Grade(marks);
        System.out.println("The grade is: "+grade);



    }
    static String Grade(int marks){
        if(marks>=91 && marks<=100){
            return "AA";
        }else if(marks>=81){
            return "AB";
        }else if(marks >=71){
            return "BB";
        } else if (marks>=61) {
            return "BC";
        }else if(marks>=51) {
            return "CD";
        }
        else if(marks>=41) {
            return "DD";
        }else{
            return "fail";

        }
    }
}
