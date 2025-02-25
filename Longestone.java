class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxOnes = 0, zeroCount = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right - left + 1);
            right++;
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); 
        System.out.println(solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); 
    }
}
