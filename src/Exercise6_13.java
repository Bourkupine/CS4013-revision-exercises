//NAME: EUAN BOURKE
//ID: 21332142

public class Exercise6_13 {
    public static void main(String[] args) {

        System.out.println(getRandom(1, 6));
    }
    public static int getRandom(int x, int y) {

        if (x>y) {
            return (int) ((Math.random() * ((x-1) - (y+1))) + (y+1));
        } else {
            return (int) ((Math.random() * ((y-1) - (x+1))) + (x+1));
        }
    }

}
