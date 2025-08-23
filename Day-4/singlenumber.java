class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {4, 1, 2, 1, 2};
        int single = sol.singleNumber(nums);

        System.out.println("Single number is: " + single);  
    }
}
