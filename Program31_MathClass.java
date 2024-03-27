public class Program31_MathClass {
    public static void main(String[] args) {
        // 1. Math.abs() method: returns the absolute value
        int num = -10;
        int absValue = Math.abs(num);
        System.out.println("Absolute value of " + num + " is: " + absValue);

        // 2. Math.sqrt() method: returns the square root
        double sqrtValue = Math.sqrt(absValue);
        System.out.println("Square root of " + absValue + " is: " + sqrtValue);

        // 3. Math.pow() method: returns the value of the first argument raised to the power of the second argument
        double powValue = Math.pow(absValue, 2);
        System.out.println("Power of " + absValue + " raised to 2 is: " + powValue);

        // 4. Math.max() method: returns the greater of two values
        int maxNum = Math.max(num, (int)powValue);
        System.out.println("Max between " + num + " and " + (int)powValue + " is: " + maxNum);

        // 5. Math.random() method: returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        double randomNum = Math.random();
        System.out.println("Random number is: " + randomNum);
    }
}
