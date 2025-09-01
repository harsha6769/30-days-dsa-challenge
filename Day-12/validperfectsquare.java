class Solution367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            if (sq > num) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Solution367 sol = new Solution367();
        System.out.println(sol.isPerfectSquare(16)); // true
        System.out.println(sol.isPerfectSquare(14)); // false
    }
}
