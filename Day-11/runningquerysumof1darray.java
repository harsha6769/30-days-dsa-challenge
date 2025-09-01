import java.util.Arrays;

class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution1480 sol = new Solution1480();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sol.runningSum(nums))); 
        // Output: [1, 3, 6, 10]
    }
}
