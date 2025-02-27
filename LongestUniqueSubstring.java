import java.util.*;
public class LongestUniqueSubstring {
    public static int longestUniqueSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) 
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUniqueSubstring(s));
    }
}