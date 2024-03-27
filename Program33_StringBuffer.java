public class Program33_StringBuffer {
    public static void main(String[] args) {
        // 1. append() method: appends the string representation of the argument to the sequence
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // 2. insert() method: inserts the string representation of the second argument into the sequence at the specified position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. delete() method: removes the characters in the substring of this sequence
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // 4. reverse() method: causes this character sequence to be replaced by the reverse of the sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 5. length() method: returns the length (character count) of this sequence
        int length = sb.length();
        System.out.println("Length of the string buffer is: " + length);
    }
}
