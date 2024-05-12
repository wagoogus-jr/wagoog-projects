public class Millionaire {
    public static void main(String[] args) {

        float amountInAccount = 50.22f; // variable declaration
        amountInAccount = amountInAccount + 1_000_000.00f; // assignment statement
//          ^variable         ^variable         ^literal (these underscores don't affect the number, it's just a substitute for commas that the compiler likes)
        // a varible's value can vary. a literal's value does not.

        System.out.print("You have $"); // says things, and then leaves the cursor at the end of the line
        System.out.print(amountInAccount);
        System.out.println(" in your account"); // CONTINUES the line, and THEN moves the cursor to the next line

        float x; // floats allow for decimal points
        double y; // doubles have double the accuracy of a float;
        // BigDecimal z = 50.22; // big decimals just have 2 decimal points. should be called small decimals but. whatever.

    }
}