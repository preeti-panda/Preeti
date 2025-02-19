class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num; // Update the smallest number
            } else if (num <= second) {
                second = num; // Update the second smallest number
            } else {
                return true; // Found a number greater than both first and second
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        
        System.out.println(sol.increasingTriplet(nums1)); // true
        System.out.println(sol.increasingTriplet(nums2)); // false
        System.out.println(sol.increasingTriplet(nums3)); // true
    }
}
