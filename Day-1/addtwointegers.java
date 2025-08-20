class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Solution solution = new Solution(); 
        int a = 10;
        int b = 20;
        int result = solution.sum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + result);
    }
}
