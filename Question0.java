class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double currentSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        System.out.println(solution.findMaxAverage(nums1, k1)); 
        int[] nums2 = {5};
        int k2 = 1;
        System.out.println(solution.findMaxAverage(nums2, k2)); 
    }
}
