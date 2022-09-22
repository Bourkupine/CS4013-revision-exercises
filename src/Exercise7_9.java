//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        //have a hash map so i can work with ints instead of chars.
        //This will help later on when determining who's go it is

        HashMap<Integer, Character> map = new HashMap<>();
        map.put(0, 'X');
        map.put(1, 'O');

        //fill my array with ' ' instead of it being "null"

        for (char[] i : board) {
            Arrays.fill(i, ' ');
        }

        //System.out.println(Arrays.deepToString(board));

        Scanner in = new Scanner(System.in);

        boolean ongoing = true; //this variable will be used to determine whether the game is ongoing or over
        int counter = 0; //counter will be used later to determine whos go it is


        while (ongoing) {

            System.out.printf("Enter a row for player %s (0-2): ", map.get(counter % 2));
            String input = in.nextLine();
            int row = Integer.parseInt(input);
            System.out.printf("Enter a column for player %s (0-2): ", map.get(counter % 2));
            input = in.nextLine();
            int col = Integer.parseInt(input);

            if (board[row][col] == ' ') {
                board[row][col] = map.get(counter % 2);

                System.out.println(display(board));

                ongoing = checker(board);
                if (!ongoing) {
                    System.out.printf("%s Player Won", map.get(counter % 2));
                }
                counter++;
                if (counter == 9 && checker(board)) {
                    ongoing = false;
                    System.out.println("Tie!");
                }
            } else
            {System.out.println("That position is already used");}
        }

    }

    /** Returns the formatted board to be printed.
     * @param board A 2d array containing the board info
     * @return A StringBuilder containing all info about the board, which can be printed
     */

    public static StringBuilder display(char[][] board) {

        StringBuilder displayBoard = new StringBuilder();
        Formatter fm = new Formatter(displayBoard);

        for (int i = 0; i < 3; i++) {
            displayBoard.append("―――――――――――――\n");
            fm.format("| %s | %s | %s |\n", board[i][0], board[i][1], board[i][2]);
        }
        displayBoard.append("―――――――――――――\n");

        return displayBoard;
    }

    /** Checks if a player has won
     *
     * @param board A 2d array containing all the board info
     * @return True/false to whether someone has won yet.
     */

    public static boolean checker (char[][] board) {

        int i = 0;
        //row checker
        while (i < 3) {
            if (board[i][0] != ' ') { //need to check if it's not ' ', otherwise it will count it as 3
                if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                    return false;
                }
            }
            i++;
        }
        i = 0;
        //column checker
        while (i < 3) {
            if (board[0][i] != ' ') {
                if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                    return false;
                }
            }
            i++;
        }
        //diagonal checker
        if (board[2][2] != ' ') {
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] || board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
                return false;
            }
        }
        return true; //returns true if game is still ongoing, i.e. no one has won yet

    }
}

/*
    If I ever come back to this, I might try make the checker code more efficient by only checking the cases which
    involve the entered x/o.
 */