//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args) {

        System.out.print("Enter Year: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int year = Integer.parseInt(input);

        System.out.print("Enter Month: ");
        input = in.nextLine();
        int m = Integer.parseInt(input);

        System.out.print("Enter Day: ");
        input = in.nextLine();
        int q = Integer.parseInt(input);

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //fix if jan / feb
        if (m < 3) {
            m += 12;
            year--;
        }

        int j = year/100;
        int k = year % 100;

        //FORMULA
        int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) + (int)(j / 4.0) + (5 * j)) % 7;

        System.out.printf("Day of the week is %s", days[h]);

    }
}
/*
h = day of week
q = day of month
m = month
j = century
k = year of century
 */