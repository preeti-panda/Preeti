import java.util.*;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies any kid currently has
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Check for each kid if giving them extraCandies will make them have the greatest
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // Start from the third element

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(kidsWithCandies(candies1, extraCandies1)); // Output: [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(kidsWithCandies(candies2, extraCandies2)); // Output: [true, false, false, false, false]

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(kidsWithCandies(candies3, extraCandies3)); // Output: [true, false, true]

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = removeDuplicates(nums1);
        System.out.print("Output: " + k1 + ", nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1 - 1 ? ", " : "]\n"));
        }

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = removeDuplicates(nums2);
        System.out.print("Output: " + k2 + ", nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2 - 1 ? ", " : "]\n"));
        }

        int[] nums3 = {3, 2, 3};
        System.out.println("Majority Element: " + majorityElement(nums3)); // Output: 3

        int[] nums4 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(nums4)); // Output: 2

        int[] nums5 = {1, 2, 3, 4, 5, 6, 7};
        int rotateSteps1 = 3;
        rotate(nums5, rotateSteps1);
        System.out.print("Rotated Array: [");
        for (int i = 0; i < nums5.length; i++) {
            System.out.print(nums5[i] + (i < nums5.length - 1 ? ", " : "]\n"));
        }

        int[] nums6 = {-1, -100, 3, 99};
        int rotateSteps2 = 2;
        rotate(nums6, rotateSteps2);
        System.out.print("Rotated Array: [");
        for (int i = 0; i < nums6.length; i++) {
            System.out.print(nums6[i] + (i < nums6.length - 1 ? ", " : "]\n"));
        }
    }
}
