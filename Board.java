/*
* Responisble for keeping track of the state of the board
*/

public class Board {
    // state
    private static String [] gameBoard =  {" "," "," "," "," "," "," "," "," "," "};

    //contructor voor nu niet nodig

    // behaviour
    public static void getGameBoard() {
        System.out.println("     " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
        System.out.println("     -----------");
        System.out.println("     " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
        System.out.println("     -----------");
        System.out.println("     " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3]);
    }

    public static void setGameBoard(int positionOnBoard, String playerSymbol) { 
        if (gameBoard[positionOnBoard] != " ") {
            System.out.println("hier kan je jouw " + playerSymbol + " niet plaatsen, hier staat al wat.");
            Players.askMove(playerSymbol);
        } else {
            gameBoard[positionOnBoard] = playerSymbol.toUpperCase();
        }
    }

    // public static boolean isWinner() 



}    