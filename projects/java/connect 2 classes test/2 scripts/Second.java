import static java.lang.System.out;

class Second { // class doesn't HAVE to be public, since nothing else is accessing this
    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.x = 324;
        out.println(mainInstance.x);
    }
}

// this is the script that actually does everything
// compile these scripts (use the javac command: javac Main.java)
// and then run this script with the regular java command