class Solution724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution724 sol = new Solution724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(sol.pivotIndex(nums)); // Output: 3
    }
}
