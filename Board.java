public class Board {
    private static String [] gameBoard =  {" "," "," "," "," "," "," "," "," "," "};
    // private static int move;

    public static void getGameBoard() {
        System.out.println("     " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
        System.out.println("     -----------");
        System.out.println("     " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
        System.out.println("     -----------");
        System.out.println("     " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3]);
    }

    public static void setGameBoard(int move, String playerSymbol) { 
        while (gameBoard[move] != " ") {
            System.out.println("hier kan je jouw " + playerSymbol + " niet plaatsen, hier staat al wat.");
            move = Players.askMove(playerSymbol);
            if (gameBoard[move] == " ") {
                break;
            }
        }

        gameBoard[move] = playerSymbol.toUpperCase();
    }

    public static boolean isWinner(String playerSymbol) {
        boolean Win = false;
        int [] rows = {1, 4, 7}; 
        for (int row : rows) {
            if (gameBoard[row] == playerSymbol && gameBoard[row + 1] == playerSymbol && gameBoard[row + 2] == playerSymbol) {
                Win = true;
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (gameBoard[i] == playerSymbol && gameBoard[i + 3] == playerSymbol && gameBoard[i + 6] == playerSymbol) {
                Win = true;
            }
        }

        if ((gameBoard[1] == playerSymbol && gameBoard[5] == playerSymbol && gameBoard[9] == playerSymbol)
                || (gameBoard[3] == playerSymbol && gameBoard[5] == playerSymbol && gameBoard[7] == playerSymbol)) {
            Win = true;
        }
        return Win;
    }

    public static boolean isFull() {
        boolean full = true;
        int i = 1;
            while (full == true &&  i <=9) {
                if (gameBoard[i] == " ") {
                    full = false;
                } else {
                    i++;
                }
            }
        return full;
    }

}    