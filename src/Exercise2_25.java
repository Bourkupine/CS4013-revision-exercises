//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_25 {
    public static void main(String[] args) {

        String[] enter = {"Employee's name ", "Hours worked in a week ", "Hourly pay rate ", "Federal tax ", "State tax "};
        String[] values = new String[5];

        int i = 0;
        while (i < 5) {
            System.out.print(enter[i]);
            Scanner in = new Scanner(System.in);
            values[i] = in.nextLine();

            i++;
        }

        System.out.println(Arrays.toString(values));

        double gross = (Double.parseDouble(values[1]) * (Double.parseDouble(values[2])));
        System.out.println(gross);
        double fed = (gross * Double.parseDouble(values[3]));
        double state = gross * (Double.parseDouble(values[4]));
        double total = fed + state;
        double net = gross - total;

        System.out.println(Double.parseDouble(values[2]));
        System.out.println();
        System.out.println("Employee's Name: " + values[0]);
        System.out.println("Hours Worked: " + values[1]);
        System.out.println("Pay Rate: " + values[2]);
        System.out.println("Gross Pay: " + gross);
        System.out.println("Deductions:");
        System.out.printf(" Federal Withholding (%s): $%.2f", values[3], fed);
        System.out.printf("\n State Withholding (%s): $%.2f", values[4], state);
        System.out.println("\nTotal Deduction: $" + total);
        System.out.println("Net Pay: $" + net);


    }
}
