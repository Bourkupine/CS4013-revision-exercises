//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Scanner;

public class Exercise3_17 {
    public static void main(String[] args) {

        int comp = (int) (Math.random() * 3);

        System.out.println("Scissor (0), rock (1), paper (2): ");

        String[] list = {"Scissor", "Rock", "Paper"};

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int player = Integer.parseInt(input);
        System.out.printf("The Computer is %s. You are %s. ", list[comp], list[player]);

        if (player - comp == -1 || player - comp == 2) {
            System.out.println("Computer wins");
        }
        else if (player - comp == 0) {
            System.out.println("Draw");
        }
        else System.out.println("Player wins");

    }
}
