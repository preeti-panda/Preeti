import java.util.*;
public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] nums, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == K) 
                maxLen = i + 1;
            if (!map.containsKey(sum)) 
                map.put(sum, i);
            if (map.containsKey(sum - K)) 
                maxLen = Math.max(maxLen, i - map.get(sum - K));
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 4, 2};
        int K = 6;
        System.out.println(longestSubarray(nums, K));
    }
}