import static java.lang.System.out;

public class PrognasticationGame {
    public static void main(String[] args) {
        int i = 10;
        out.println(i++); // print 10, i = 11
        out.println(--i); // print 10, i = 10
        --i; // i = 9
        i--; // i = 8
        out.println(i); // print 8
        out.println(++i); // print 9, i = 9
        out.println(i--); // print 9, i = 8
        out.println(i); // print 8
        i++; // i = 9
        i = i++ + ++i; // i = 10 + 10?
        out.println(i); // print 20??? (print 20!!!!! i was right B) )
        i = i++ + i++; // i = shouldbe21 + shouldbe21???? confused
        out.println(i); // print 41???
    }
}