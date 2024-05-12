import java.util.Random;
import java.util.Scanner; // name of a class, dont use static

import static java.lang.System.out; // NOT the name of a class. use static

public class GuessingGame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter an integer from 1 to 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if(inputNumber == randomNumber) {
            out.println("**********");
            out.println("*You win!*");
            out.println("**********");
        }
        else {
            out.println("You lose :(");
            out.println("The random number was: ");
            out.println(randomNumber);
        }

        keyboard.close();
    }

}