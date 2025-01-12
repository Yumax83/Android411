package lesson27.enums2_RANDOM;

import java.util.Random;

public enum  Direction {
    TOP, RIGHT, BOTTOM, LEFT;
    private static final Random RAND = new Random();
    public static  Direction randomDirection()
    {
        Direction[] directions = values();
        return directions[RAND.nextInt(directions.length)];
    }
}
