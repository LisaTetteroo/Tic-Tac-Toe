<<<<<<< HEAD
=======
// TODO: player class simplificeren: KISS

>>>>>>> boardsetup
import java.util.Scanner;

public class Players {
    static String inputFromPlayerString;
    static int inputFromPlayerInt;
    static int move;
    static Scanner input = new Scanner(System.in);   

    public static int askMove(String playerSymbol) {
        System.out.println("waar wil je jouw " + playerSymbol + " zetten? Type geheel getal van 1 tot 9:");
        inputFromPlayerString = input.next();
        convertInputPlayerToInt(playerSymbol);

        if (inputFromPlayerIsValid()) {
            move = inputFromPlayerInt;
        } else {
            askMove(playerSymbol);
        }    
        return move;
    }

    public static int convertInputPlayerToInt(String playerSymbol) {
        if (inputFromPlayerIsInt() == true) {
            inputFromPlayerInt = Integer.parseInt(inputFromPlayerString);  
        } else {
            System.out.println("Invoer is onjuist, kies een geheel getal tussen 1 en 9:");
            askMove(playerSymbol);
        }
        return inputFromPlayerInt; 
    }
    
    public static boolean inputFromPlayerIsInt() {
        boolean isInt = false;
        for (int i = 0; i < inputFromPlayerString.length(); i++) {
            if (Character.isDigit(inputFromPlayerString.charAt(i)) == true) {
                isInt = true;
            } else {
                isInt = false;
                break;
            }
        }
        return isInt;
    }

    public static boolean inputFromPlayerIsValid() {
        if (inputFromPlayerInt < 1 || inputFromPlayerInt > 9) {
            System.out.println("Invoer is onjuist, kies een geheel getal tussen 1 en 9:");    
            return false;
        } else {
            return true;
        }
    }
}