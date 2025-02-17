class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        return thousands[num / 1000] + 
               hundreds[(num % 1000) / 100] + 
               tens[(num % 100) / 10] + 
               ones[num % 10];
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num1 = 3749;
        int num2 = 58;
        int num3 = 1994;
        
        System.out.println(solution.intToRoman(num1)); // Output: MMMDCCXLIX
        System.out.println(solution.intToRoman(num2)); // Output: LVIII
        System.out.println(solution.intToRoman(num3)); // Output: MCMXCIV
    }
}
