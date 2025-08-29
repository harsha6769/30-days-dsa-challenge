class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "abca";   // true (remove 'c')
        String s2 = "abc";    // false

        System.out.println(s1 + " valid palindrome after at most one removal? " + sol.validPalindrome(s1));
        System.out.println(s2 + " valid palindrome after at most one removal? " + sol.validPalindrome(s2));
    }
}
