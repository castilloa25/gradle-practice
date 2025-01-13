package dice;

import java.util.Random;

public class Dice {
    public int roll(int sides) {
        return new Random().nextInt(sides) + 1;
    }
}
