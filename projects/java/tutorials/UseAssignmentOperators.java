import static java.lang.System.out;

public class UseAssignmentOperators {
    public static void main(String[] args) {
        int bunnies = 27;
        int extra = 53;

        bunnies += 1;
        out.println(bunnies);

        bunnies += 5;
        out.println(bunnies);

        bunnies += extra;
        out.println(bunnies);

        bunnies *= 2;
        out.println(bunnies);

        out.println(bunnies -= 7);

        out.println(bunnies = 100);
    }
}