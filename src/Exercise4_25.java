//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Scanner;

public class Exercise4_25 {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int num = Integer.parseInt(input);

        int total = 0;
        while (num > 0) {
            total += add(num);
            num--;
        }
        System.out.println("The sum = " + total);
    }
    public static int add (int input) {

        int sum = 0;
        while (input > 0) {
            sum += input;
            input--;
        }
        return sum;

    }
}
