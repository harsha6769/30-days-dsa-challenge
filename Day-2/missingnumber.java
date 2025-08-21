class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = n * (n + 1) / 2;
        int array_sum = 0;
        for (int num : nums) {
            array_sum += num;
        }
        return total_sum - array_sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};

        System.out.println(sol.missingNumber(nums1)); // Output: 2
        System.out.println(sol.missingNumber(nums2)); // Output: 2
        System.out.println(sol.missingNumber(nums3)); // Output: 8
    }
}
