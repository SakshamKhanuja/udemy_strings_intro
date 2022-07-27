public class Main {

    public static void main(String[] args) {
        // Initializing a variable of type "String" just like the rest primitive data types.
        String myString = "This is a string";

        // Prints the contents of "myString".
        System.out.println("myString = " + myString);

        // Appends string literal to "myString".
        myString = myString + ", and this is more.";

        // Prints the contents of "myString".
        System.out.println("myString = " + myString);

        // Appends unicode characters to "myString".
        myString = myString + " \u00A9 2022";

        // Prints the contents of "myString".
        System.out.println("myString = " + myString);

        // String variable contains only numbers as its content.
        String numberString = "250.55";

        /*
         * Adding a string literal containing only numbers to "numberString". As Strings is NOT a numeric type, it will
         * treat text or digits inside it as text only. Hence, it will append contents of the string literal to
         * "numberString".
         */
        numberString = numberString + "49.95";

        // Prints the contents of "numberString".
        System.out.println(numberString);

        // Initializing a different String variable.
        String lastString = "10";

        // Initializing an "int" variable.
        int myInt = 50;

        /*
         * Appending a numeric data type to a String. Java takes the contents of "myInt" and converts it to text which
         * is then appended to "lastString".
         */
        lastString = lastString + myInt;

        // Prints the contents of "lastString".
        System.out.println("lasString = " + lastString);
    }
}
