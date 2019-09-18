package Zoo.Hao_Linus_Yuta;

public abstract class Animal {
    final private String name;

    Animal(final String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name + "(" + getClass().getSimpleName() + ")";
    }

    protected String sleep() {
        return getName() + " is sleeping (Zzzzz)";
    }

    protected String wakeup() {
        return getName() + " waked up just now";
    }

    protected String eat() {
        return getName() + " is eating";
    }

    abstract protected String makeNoise();

    abstract protected String roam();
}