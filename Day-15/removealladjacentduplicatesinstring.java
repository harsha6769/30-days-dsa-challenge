class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1047 sol = new Solution1047();
        System.out.println(sol.removeDuplicates("abbaca"));   // "ca"
        System.out.println(sol.removeDuplicates("azxxzy"));   // "ay"
    }
}
