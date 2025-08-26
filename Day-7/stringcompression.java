public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int read = 0;

        while (read < n) {
            char current = chars[read];
            int start = read;

            while (read < n && chars[read] == current) read++;
            int count = read - start;

            chars[write++] = current;
            if (count > 1) {
                String cntStr = Integer.toString(count);
                for (char digit : cntStr.toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] arr1 = {'a','a','b','b','c','c','c'};
        int len1 = compress(arr1);
        System.out.println(len1 + " -> " + new String(arr1, 0, len1)); // Output: 6 -> a2b2c3

        char[] arr2 = {'a'};
        int len2 = compress(arr2);
        System.out.println(len2 + " -> " + new String(arr2, 0, len2)); // Output: 1 -> a

        char[] arr3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int len3 = compress(arr3);
        System.out.println(len3 + " -> " + new String(arr3, 0, len3)); // Output: 4 -> ab12
    }
}
