import java.util.HashSet;
import java.util.Iterator;
public class Question {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("Using Lambda Expression:");
        set.forEach(element -> System.out.println(element));
        System.out.println("\nUsing Method Reference:");
        set.forEach(System.out::println);
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
