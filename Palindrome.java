class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        
        String filteredStr = filtered.toString();
        String reversedStr = filtered.reverse().toString();
        
        return filteredStr.equals(reversedStr);
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(sol.isPalindrome("race a car")); // Output: false
        System.out.println(sol.isPalindrome(" ")); // Output: true
    }
}
