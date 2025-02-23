import java.util.*;
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }
    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                backtrack(nums, current, used, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.permute(new int[]{1,2,3}));
        System.out.println(sol.permute(new int[]{0,1}));
        System.out.println(sol.permute(new int[]{1}));
    }
}
