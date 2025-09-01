class VersionControl {
    // Simulating the first bad version
    int bad = 4; // Example: version 4 is the first bad version

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}

class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; // move left
            } else {
                left = mid + 1; // move right
            }
        }
        return left;
    }

    // Main method
    public static void main(String[] args) {
        Solution278 sol = new Solution278();
        System.out.println(sol.firstBadVersion(10)); // Output: 4
    }
}
