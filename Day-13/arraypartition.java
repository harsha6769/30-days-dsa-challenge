import java.util.Arrays;

class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Solution561 sol = new Solution561();
        int[] nums = {1,4,3,2};
        System.out.println(sol.arrayPairSum(nums)); // Output: 4
    }
}
