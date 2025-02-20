
import java.util.*;
public class AddAll
{
   public static void main(String[] args){
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    list1.add(10);
    list2.add(20);
    System.out.println("List 1"+list1);
    list2.add(30);
    list2.add(40);

    list1.addAll(list2);
    System.out.println("List 1 After adding list2..."+list1);

   }
}
