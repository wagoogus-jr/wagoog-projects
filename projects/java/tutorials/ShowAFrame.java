import javax.swing.JFrame;

public class ShowAFrame {
    public static void main(String[] args) {

        JFrame myFrame = new JFrame(); // JFrame is a class. this line makes a new instance of the JFrame class
        String myTitle = "Blank Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}