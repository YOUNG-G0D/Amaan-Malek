public class Program30_Wrapper {
    public static void main(String[] args) {
        // Autoboxing: Converting a primitive value into an object of the corresponding wrapper class
        int num = 10;
        Integer numObject = num;  // Autoboxing
        System.out.println("Value of numObject: " + numObject);

        // Unboxing: Converting an object of a wrapper class to its corresponding primitive value
        Integer anotherNumObject = new Integer(20);
        int anotherNum = anotherNumObject;  // Unboxing
        System.out.println("Value of anotherNum: " + anotherNum);
    }
}
