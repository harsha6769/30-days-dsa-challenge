class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

      
        System.out.println(sol.firstUniqChar("leetcode"));      
        System.out.println(sol.firstUniqChar("loveleetcode"));  
        System.out.println(sol.firstUniqChar("aabb"));          
        System.out.println(sol.firstUniqChar("abcabcde"));      
        System.out.println(sol.firstUniqChar("zz"));            
    }
}
