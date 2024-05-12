public class ElevatorFitter {
    public static void main(String[] args) {

        int weightOfAPerson, elevatorWeightLimit, numberOfPeople; // you can initialize multiple variables in the same line, if theyre the same type.
        int x = 5, y = 4, z = 3; // you can even assign (declare) their values in the same line

        weightOfAPerson = 150;
        elevatorWeightLimit = 1400;
        numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        System.out.print("You can fit ");
        System.out.print(numberOfPeople);
        System.out.println(" people on the elevator");

        // more types of variables
        byte yargle = 127; // bytes are a single byte. duh. must be less than 127.
        short blargle = 32767; // shorts are short numbers. must be smaller than 32,767.
        int yeegus = 2_147_483_647; // ints must be shorter than whatever that is.
        // long weegus = 9_223_372_036_854_775_807; // longs are a little long. does not compile for some reason

        // if youre in a main method, you dont have to declare the type of the variable
        var heehoo = 235;
        var hoohee = "hullo";

        /* this doesnt work. it has to know what type the variable is immediately
        var numOfCats;
        numOfCats = 3;
        */

    }
}