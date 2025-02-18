public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); 
        int lastSpaceIndex = s.lastIndexOf(" ");
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); 
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); 
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); 
    }
}
