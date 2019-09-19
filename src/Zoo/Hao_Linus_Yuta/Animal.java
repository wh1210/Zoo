package Zoo.Hao_Linus_Yuta;

/**
 * Create a abstract animals class for each kind animal in Zoo
 * each method would be extend by 3 kinds of animals
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public abstract class Animal {
    final private String name;

    Animal(final String name) {
        this.name = name;
    }

    //method for get each kind of animal's name
    protected String getName() {
        return this.name + "(" + getClass().getSimpleName() + ")";
    }

    //method for each kind of animal goes to sleep
    protected String sleep() {
        return getName() + " is sleeping (Zzzzz)";
    }

    //method for each kind of animal wakes up
    protected String wakeup() {
        return getName() + " waked up just now";
    }

    //method for each kind of animal eats
    protected String eat() {
        return getName() + " is eating";
    }

    //method for each kind of animal makes noise
    abstract protected String makeNoise();

    //method for each kind of animal roam
    abstract protected String roam();
}