package Zoo.Hao_Linus_Yuta;

/**
 * Create a abstract animals class for each kind animal in Zoo
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public abstract class Animal {
    final private String name;

    Animal(final String name) {
        this.name = name;
    }

    // method for get each animal's name
    protected String getName() {
        return this.name + "(" + getClass().getSimpleName() + ")";
    }

    // method for going to sleep
    protected String sleep() {
        return getName() + " is sleeping (Zzzzz)";
    }

    // method for waking up
    protected String wakeup() {
        return getName() + " waked up just now";
    }

    // method for eating
    protected String eat() {
        return getName() + " is eating";
    }

    // abstract method for making noise
    abstract protected String makeNoise();

    // abstract method for roaming
    abstract protected String roam();
}