/**
 * resposible for showing screen(items) to user
 */

public class Game {
    public static void refreshScreen() {
        header();
        Board.getGameBoard();
        Players.askMove();
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

}