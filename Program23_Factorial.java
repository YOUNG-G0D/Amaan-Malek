import java.math.BigInteger;
import java.util.Scanner;

public class Program23_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("Factorial of %d = %d%n", num, factorial);
    }
}
