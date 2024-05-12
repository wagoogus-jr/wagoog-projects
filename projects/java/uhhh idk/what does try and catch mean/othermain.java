public class othermain {
    static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("nuh uh uh");
        }
        else {
            System.out.println("oh yah");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}