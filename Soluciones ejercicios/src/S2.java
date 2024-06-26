import java.util.Scanner;

public class S2 {
    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inputs;
        inputs = new Scanner(System.in);
        int testNumber;
        System.out.println("Fill up a Numer to check if it's a Cousin Prime Number");
        testNumber = inputs.nextInt();
        // You can change this number to test other values
        if (isPrime(testNumber)) {
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }
    }
}
