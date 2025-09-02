public class Main410 {
    public static void main(String[] args) {
        Solution410 sol = new Solution410();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(sol.splitArray(nums, k)); // Output: 18
    }
}

class Solution410 {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int n : nums) {
            left = Math.max(left, n);
            right += n;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, currSum = 0;
        for (int n : nums) {
            if (currSum + n > maxSum) {
                count++;
                currSum = 0;
            }
            currSum += n;
        }
        return count <= k;
    }
}
