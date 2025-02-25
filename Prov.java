class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, currentVowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        return maxVowels;
    }
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxVowels("abciiidef", 3)); 
        System.out.println(solution.maxVowels("aeiou", 2)); 
        System.out.println(solution.maxVowels("leetcode", 3)); 
    }
}
