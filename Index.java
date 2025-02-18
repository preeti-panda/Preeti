public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(solution.strStr("leetcode", "leeto")); // Output: -1
    }
}
