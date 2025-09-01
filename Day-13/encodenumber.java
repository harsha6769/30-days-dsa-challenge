class Solution1256 {
    public String encode(int num) {
        return Integer.toBinaryString(num + 1).substring(1);
    }

    // Main method
    public static void main(String[] args) {
        Solution1256 sol = new Solution1256();
        System.out.println(sol.encode(23)); // Output: "1000"
        System.out.println(sol.encode(6));  // Output: "111"
    }
}
