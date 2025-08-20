import java.util.Arrays;

class Solution {
    // Method to move all zeroes to the end
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        // Move non-zero elements to the front
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    // Main method to test the moveZeroes method
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12}; // Test array
        System.out.println("Before moving zeroes: " + Arrays.toString(nums));

        solution.moveZeroes(nums); // Call the method

        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }
}
