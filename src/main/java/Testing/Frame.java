package Testing;

public class Frame {

    int firstRoll;
    int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public void setFirstRoll(int firstRoll) {
        this.firstRoll = firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    public void setSecondRoll(int secondRoll) {
        this.secondRoll = secondRoll;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "firstRoll=" + firstRoll +
                ", secondRoll=" + secondRoll +
                '}';
    }
}
