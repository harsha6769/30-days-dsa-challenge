import java.util.*;

class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) count++;
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Solution1773 sol = new Solution1773();
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        System.out.println(sol.countMatches(items, "color", "silver")); // Output: 1
        System.out.println(sol.countMatches(items, "type", "phone"));   // Output: 2
    }
}
