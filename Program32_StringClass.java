public class Program32_StringClass {
    public static void main(String[] args) {
        // 1. length() method: returns the length of the string
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string is: " + length);

        // 2. charAt() method: returns the character at the specified index
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5 is: " + charAt5);

        // 3. substring() method: returns a new string that is a substring of the original string
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12 is: " + substring);

        // 4. toLowerCase() method: converts all the characters in the string to lower case
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string is: " + lowerCaseStr);

        // 5. replace() method: returns a new string resulting from replacing all occurrences of old characters with new characters
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacing 'o' with 'a' is: " + replacedStr);
    }
}
