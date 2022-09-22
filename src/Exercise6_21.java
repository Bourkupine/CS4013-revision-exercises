//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {

        System.out.println("How many balls would you like?");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int balls = Integer.parseInt(input);

        System.out.println("How many slots would you like?");
        input = in.nextLine();
        int slotAmount = Integer.parseInt(input);

        int initialSlotAmount = slotAmount;

        int[] slots = new int[slotAmount + 1];

        int pos = 0;

        //generating the RL sequence && adding to corresponding position on array

        while (balls > 0) {
            while (slotAmount > 0) {

                int k = (int) (Math.random() * 2);
                if (k == 1) {
                    pos++;
                    System.out.print("R");
                } else {
                    System.out.print("L");
                }
                slotAmount--;
            }
            System.out.println();

            slots[pos]++;
            balls--;
            slotAmount = initialSlotAmount;
            pos = 0;
        }

        int[] temp = slots.clone();
        //System.out.println(Arrays.toString(slots));

        StringBuilder display = new StringBuilder();

        Arrays.sort(temp);
        int max = temp[slots.length - 1];

        int i = 0;

        //displaying the array using StringBuilders

        while (max > 0) {
            while (i < slots.length) {

                if (slots[i] >= max) {
                    display.append("0");
                } else {
                    display.append(" ");
                }
                i++;
            }
            i = 0;
            display.append("\n");
            max--;
        }
        System.out.println();
        System.out.println(display + "^".repeat(slots.length));


    }
}
