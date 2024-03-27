public class kunner {
    public static void main(String[] args) {
        // Test the function
        System.out.println(esDivisible(10, 2)); // Should return true
        System.out.println(esDivisible(10, 3)); // Should return false
    }

    public static boolean esDivisible(int n, int divisor) {
        // Check if divisor is zero to prevent division by zero error
        if (divisor == 0) {
            return false;
        }
        // Return true if n is divisible by divisor, false otherwise
        return n % divisor == 0;
    }
}
