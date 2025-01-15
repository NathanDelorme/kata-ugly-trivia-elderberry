package info.dmerej;

public class FakeRandom implements IRandomable {
    private final int[] valuesDiceFour;
    private final int[] valuesDiceEight;
    private int index;

    public FakeRandom(int[] valuesDiceFour, int[] valuesDiceEight) {
        this.valuesDiceFour = valuesDiceFour;
        this.valuesDiceEight = valuesDiceEight;
        this.index = 0;
    }

    public int nextInt(int bound) {
        if (bound == 5) {
            return getDiceFourNextInt();
        } else if (bound == 9) {
            return getDiceEightNextInt();
        }
        throw new IllegalArgumentException("Unsupported bound: " + bound);
    }

    private int getDiceFourNextInt() {
        return valuesDiceFour[index++];
    }

    private int getDiceEightNextInt() {
        return valuesDiceEight[index++];
    }
}
