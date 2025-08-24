public class Solution191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution191 sol = new Solution191();
        int input = 11;
        System.out.println(sol.hammingWeight(input));
    }
}
