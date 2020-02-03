/**
 * resposible for showing screen(items) to user
 */

public class Game {
    private static String playerSymbol;
    private static String gameState;

    public static void refreshScreen() {
        header();
        Board.getGameBoard();
<<<<<<< HEAD
        Players.askMove("X");
=======
        playerSymbol = "X";
		int postionOnBoard = Players.askMove(playerSymbol);
>>>>>>> boardsetup
    }
    public static void header() {
        System.out.println("Boter-kaas-eieren");
        System.out.println("Om een vak op het bord te kiezen wordt om een getal tussen 1 en 9 gevraagd.");
        System.out.println("Dit getal komt overeen met een vak op het bord zoals aangegeven in het schema hieronder.");
        System.out.println("Het makkelijkste is om het numpad te gebruiken, de volgorde van de getallen komt overeen.");
        System.out.println("X begint");
        System.out.println("");
        System.out.println("     7 | 8 | 9 ");
        System.out.println("     -----------");
        System.out.println("     4 | 5 | 6 ");
        System.out.println("     -----------");
        System.out.println("     1 | 2 | 3 ");
        System.out.println("");
        System.out.println("=====================");
        System.out.println("");
    }    

    public static String stateOfGame(String playerSymbol) {
        if (Board.isWinner(playerSymbol) == true) {
            System.out.println("Speler " + playerSymbol + " wint!");
            gameState = "win";
        } else if (Board.isFull() == true) {
            System.out.println("Gelijkspel, het bord is vol");
            gameState = "full";
        } else {
            gameState = "play";
        }
        return gameState;
    }

}