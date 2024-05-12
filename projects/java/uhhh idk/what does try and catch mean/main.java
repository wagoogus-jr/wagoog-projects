public class main {
    public static void main(String[] args) {

        try {
            int[] numers = {1, 2, 3};
            System.out.println(numers[3]);
        }
        catch(Exception e) {
            System.out.println("uhh " + e);
        } finally {
        System.out.println("whar?");
        }
    }
}