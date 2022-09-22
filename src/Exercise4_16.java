//NAME: EUAN BOURKE
//ID: 21332142

import java.util.Scanner;

public class Exercise4_16 {
    public static void main(String[] args) {

        //Gets user input

        System.out.print("Enter Number: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int num = Integer.parseInt(input);

        int i = 2;
        boolean none = true; //this variable will be used in the cases where there are no prime factors, i.e. '1'

        //Cycle through and find factors with use of '%'

        while (i <= num) {
            if (num % i == 0 && isPrime(i)) {
                System.out.print(i + ", ");
                none = false;
            }
            i++;
        }
        if (none) {
            System.out.println("There are none");
        }
    }
    //This method just checks if an input is Prime.

    static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
