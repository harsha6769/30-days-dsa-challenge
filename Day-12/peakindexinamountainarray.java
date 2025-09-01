class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // peak is on the right
            } else {
                right = mid; // peak is mid or left
            }
        }
        return left;
    }

    // Main method
    public static void main(String[] args) {
        Solution852 sol = new Solution852();
        int[] arr = {0, 2, 4, 6, 5, 3, 1};
        System.out.println(sol.peakIndexInMountainArray(arr)); // Output: 3
    }
}
