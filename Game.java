/**
 * resposible for showing screen(items) to user
 */

import java.io.IOException;

public class Game {
    private static String playerSymbol;
    private static int move;

    public static void gameplay() throws IOException, InterruptedException {
        refreshScreen();
        while (true) {
                        playerSymbol = "X";
            move = Players.askMove(playerSymbol);
            Board.setGameBoard(move, playerSymbol);
            refreshScreen();
            if (continueGame(playerSymbol) != true) {
                break;
            }
            playerSymbol = "O";
            move = Players.askMove(playerSymbol);
            Board.setGameBoard(move, playerSymbol);
            refreshScreen();
            if (continueGame(playerSymbol) != true) {
                break;
            }
        }
        
    }

    public static void refreshScreen() throws IOException, InterruptedException {
        clearScreen();
        header();
        Board.getGameBoard();
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

    public static Boolean continueGame(String playerSymbol) {
        boolean gameCanContinue = false;
        if (Board.isWinner(playerSymbol) == true) {
            System.out.println("Speler " + playerSymbol + " wint!");
        } else if (Board.isFull() == true) {
            System.out.println("Gelijkspel, het bord is vol");
        } else {
            gameCanContinue = true;
        }
        return gameCanContinue;
    }

    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}
