class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isSubsequence("abc", "ahbgdc")); // Output: true
        System.out.println(sol.isSubsequence("axc", "ahbgdc")); // Output: false
    }
}
