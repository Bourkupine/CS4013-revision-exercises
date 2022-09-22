//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {

        System.out.print("Enter the monthly saving amount: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();


        int amount = Integer.parseInt(input);

        int months= 6;
        double total = 0;

        while (months > 0) {
            total = (amount + total) * 1.00417;
            months--;
        }
        double rounded = Math.round(total * 1000.0) / 1000.0;

        System.out.println("After the sixth month, the account value is $" + rounded);


    }
}
