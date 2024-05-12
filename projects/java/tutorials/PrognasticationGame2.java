import static java.lang.System.out;
public class PrognasticationGame2 {
    public static void main(String[] args) {
        int i = 10;

        i += 2; // i = 12
        i -= 5; // i = 7
        i *= 6; // i = 42

        out.println(i); // print 42
        out.println(i += 3); // print 45!
        out.println(i /= 2); // print 22!
        // x += y isnt like x++, where it prints the thing AND THEN adds whatever to x
    }
}