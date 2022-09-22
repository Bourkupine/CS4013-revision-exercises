//NAME: EUAN BOURKE
//ID: 21332142

public class Exercise5_9 {
    public static void main(String[] args) {

        int i = 1;
        int j = 20;

        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");

        while (i < 11) {
            System.out.printf("%d\t\t\t%.3f\t\t|\t\t%d\t\t\t%.3f\n", i, footToMeter(i), j, meterToFoot(j));
            i++;
            j += 5;
        }
    }
    /** Convert from feet to metres */
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }
    /** Convert from metres to feet */
    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }
}
