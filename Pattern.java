import java.util.HashMap;
public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        return true;
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (sToT.containsKey(c1)) {
                if (sToT.get(c1) != c2) {
                    return false;
                }
            } else {
                if (tToS.containsKey(c2)) {
                    return false;
                }
                sToT.put(c1, c2);
                tToS.put(c2, c1);
            }
        }
        return true;
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); 
        System.out.println(wordPattern("abba", "dog cat cat fish")); 
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); 
        System.out.println(isIsomorphic("egg", "add")); 
        System.out.println(isIsomorphic("foo", "bar")); 
        System.out.println(isIsomorphic("paper", "title")); 
        System.out.println(canConstruct("a", "b")); 
        System.out.println(canConstruct("aa", "ab")); 
        System.out.println(canConstruct("aa", "aab")); 
    }
}
