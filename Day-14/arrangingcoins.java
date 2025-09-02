public class Main441 {
    public static void main(String[] args) {
        Solution441 sol = new Solution441();
        int n = 8;
        System.out.println(sol.arrangeCoins(n)); // Output: 3
    }
}

class Solution441 {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;
            if (coins == n) return (int) mid;
            if (coins < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
}
