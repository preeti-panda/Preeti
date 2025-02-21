import java.util.ArrayList;
import java.util.Arrays;

public class Countkeyelement {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>(Arrays.asList(6.5f, 6.7f, 8.9f, 7.8f, 9.0f, 5.4f, 7.6f));
        int count = 0;
        for (Float score : list) {
            if (score > 7.5f) {
                count++;
            }
        }
        System.out.println("Number of students who scored above 7.5: " + count);
    }
}
