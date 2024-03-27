import java.util.Scanner;

public class Program24_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        long sum = 0;
        for (; number != 0; number /= 10) {
            sum += number % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
