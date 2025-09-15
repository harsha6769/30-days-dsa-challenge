public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int cur = 0;
        boolean down = true;
        for (char c : s.toCharArray()) {
            rows[cur].append(c);
            if (cur == 0) down = true;
            else if (cur == numRows - 1) down = false;
            cur += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3)); // Output: PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4)); // Output: PINALSIGYAHRPI
        System.out.println(convert("A", 1));              // Output: A
    }
}
