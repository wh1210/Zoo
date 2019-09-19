package Zoo.Hao_Linus_Yuta;

/**
 * Create a abstract Feline class which extend by Animal for each Feline animal in Zoo
 * override the roam() method for Feline's subclasses
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public abstract class Feline extends Animal {
    Feline(final String name) {
        super(name);
    }

    @Override
    protected String roam() {
        return getName() + " is roaming" + " (Feline)";
    }
}
