//Leet code
import java.util.*;
public class CountItemsMatchingARule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size=sc.nextInt();
        List<List<String>> items = new ArrayList<>();
        for (int i = 0; i <size; i++){
           List<String> row=new ArrayList<>();
           System.out.println("Enter the type,color and name of the items "+ (i+1)+ ": ");
           row.add(sc.next());
           row.add(sc.next());
           row.add(sc.next());
           items.add(row);
        }
        System.out.print("Enter the rule key: ");
        String ruleKey=sc.next();
        System.out.print("Enter the rule Value: ");
        String ruleValue=sc.next();
      int count=Count(items,ruleKey,ruleValue);
        System.out.println("The count is: "+count);

    }
    static int Count(List<List<String>> items,String ruleKey,String ruleValue){
        int count=0;
        int index=0;
        if(ruleKey.equals("color")){
            index=1;
        }else if(ruleKey.equals("name")){
            index=2;
        }

        for(List<String> item:items){
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
