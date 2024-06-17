public class LeetCodeSumOfSquares {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            long sumOfSquares = (long) left * left + (long) right * right;
            if (sumOfSquares == c) {
                return true;
            } else if (sumOfSquares < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCodeSumOfSquares solution = new LeetCodeSumOfSquares();

        // Test cases
        System.out.println(solution.judgeSquareSum(5)); // true (1^2 + 2^2 = 5)
        System.out.println(solution.judgeSquareSum(3)); // false
        System.out.println(solution.judgeSquareSum(4)); // true (0^2 + 2^2 = 4)
        System.out.println(solution.judgeSquareSum(2)); // true (1^2 + 1^2 = 2)
        System.out.println(solution.judgeSquareSum(1)); // true (0^2 + 1^2 = 1)
        System.out.println(solution.judgeSquareSum(2147483600)); // true (can be checked based on specific values)
    }
}
