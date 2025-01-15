package info.dmerej;

import java.util.Random;

public class RandomWrapper implements IRandomable {
    private Random random;

    public Random getRandom() {
        return random;
    }

    public RandomWrapper() {
        this.random = new Random();
    }

    public int nextInt(int bound) {
        return random.nextInt(bound);
    }
}
