//NAME: EUAN BOURKE
//ID: 21332142

import java.util.ArrayList;
import java.util.Collections;


public class Exercise5_5 {
    public static void main(String[] args) {

        System.out.println(displayLargestNumber(2.6, 5.9, 3));

    }
    public static double displayLargestNumber (double num1, double num2, double num3) {

        ArrayList<Double> nums = new ArrayList<>();

        Collections.addAll(nums, num1, num2, num3);
        Collections.sort(nums);

        return nums.get(2);
    }
}


