public class Main { // The "Main" class

    int x = 5;

    public static void main(String[] args) {

        Main myObj1 = new Main(); // making a new instance of the "Main" class
        Main myObj2 = new Main();

        myObj1.x = 10;

        System.out.println(myObj1.x + myObj2.x);

    }

}