package main;
import java.util.Random;

public class RandomHelper {


private static Random random = new Random();


    /**
     * @return returns true with a 90% chance.
     */

    public static boolean getBigChance() {

        return random.nextDouble()<0.9;

    }
    /**
     * A static boolean.
     * @return returns true with 50% chance.
     */


    public static boolean get50Chance() {
        return random.nextDouble()<0.5;
    }

    /**
     * A method to get a number between 2 different values.
     * @return a number between lowest and the highest of values
     */

    public static int getInt(int lower, int upper) {

        int randomNumber = random.nextInt((upper - lower) + 1) + lower;

        return randomNumber;

    }
}
