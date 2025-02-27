import java.util.*;
public class ArraySubsetCheck {
    public static boolean isSubset(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) 
            set.add(num);
        for (int num : B) 
            if (!set.contains(num)) 
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] A = {11, 1, 13, 21, 3, 7};
        int[] B = {11, 3, 7, 1};
        System.out.println(isSubset(A, B));  
    }
}  