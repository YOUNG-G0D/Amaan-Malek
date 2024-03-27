public class Program25_ArrayIndex {
    public static void main(String[] args) {
        try {
            int[] numbers = { 10, 20, 30 };
            int index = 5; // Change this index to see the exception

            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }
}
