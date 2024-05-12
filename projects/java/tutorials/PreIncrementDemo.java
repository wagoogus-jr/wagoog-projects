import static java.lang.System.out;

public class PreIncrementDemo {
    public static void main(String[] args) {

        int bunnies = 27; // bunnies = 27

        ++bunnies; // adds 1 to bunnies
        out.println(bunnies); // prints bunnies (1 has been added to bunnies in the line before)
        out.println(++bunnies); // adds 1 to bunnies AND THEN prints the line
        // out.println(bunnies++); this would print the value of bunnies AND THEN increase it
        out.println(bunnies);
        out.println();

        bunnies = 27;

        bunnies++;
        out.println(bunnies);
        out.println(bunnies++); // print bunnies, THEN add 1 to bunnies
        out.println(bunnies);

        bunnies++; // this is both a statement AND an expression
        // statements tells the computer to do something
        // expressions have values
        // as a statement, this tells the computer to add 1 to bunnies
        // as an expresssion, the value of bunnies is 28, not 29

    }
}