import java.util.Scanner;
import java.util.Random;
public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        Random rand = new Random();
        int dice = rand.nextInt(7);
        return dice;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] ok = {0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < n; i++); {
            int dice1 = rollDie();
            int dice2 = rollDie();
            int total = dice1 + dice2;
            ok[total-2] += 1;

        }

        return ok;
    }


    public static void main(String[] args) {
        System.out.println(sumOfTwoDice(10));
    }
}
