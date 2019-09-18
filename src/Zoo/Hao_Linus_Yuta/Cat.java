package Zoo.Hao_Linus_Yuta;

import java.util.Random;

public class Cat extends Feline {
    Cat(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        // Randomly call function
        Random r = new Random();
        int randomInt = r.nextInt(3);
        switch (randomInt) {
            case 0:
                return meow();
            case 1:
                return layDown();
            case 2:
                return sharpenClaws();
            default:
                return layDown();
        }
    }

    private String meow() {
        return getName() + " is meowing";
    }

    private String layDown() {
        return getName() + " is laying down.";
    }

    private String sharpenClaws() {
        return getName() + " is sharpening claws.";
    }
}
