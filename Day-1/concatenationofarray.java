import java.util.Arrays;

class Solution {
    // Method to return concatenated array
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;             // Get the length of the original array
        int[] ans = new int[2 * n];      // Create a new array of double the size
        
        // Copy original array into first half
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        
        // Copy original array into second half
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }
        
        return ans;                       // Return the concatenated array
    }

    // Main method to test the getConcatenation method
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 1};  // Example input
        System.out.println("Original array: " + Arrays.toString(nums));

        int[] result = solution.getConcatenation(nums); // Call the method
        System.out.println("Concatenated array: " + Arrays.toString(result));
    }
}
