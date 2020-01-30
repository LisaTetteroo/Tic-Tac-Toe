import java.util.Scanner;

public class Players {
    static int positionOnBoard;
    static Scanner input = new Scanner(System.in);

    public static int askMove() {
        System.out.println("waar wil je jouw %s zetten? Type 1-9:");
        move = input.nextInt();
        while (move)
        
        positionOnBoard = move
        return positionOnBoard;
    }

    // method to check if input is an integer
    /*
    Returns true if s is a number else false 
    static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 
  
    */
}