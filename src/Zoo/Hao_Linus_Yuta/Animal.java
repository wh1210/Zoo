package Zoo.Hao_Linus_Yuta;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name + "(" + getClass().getSimpleName() + ")";
    }

    String sleep() {
        return getName() + " is sleeping (Zzzzz)";
    }

    String wakeup() {
        return getName() + " waked up just now";
    }

    String eat() {
        return getName() + " is eating";
    }

    abstract String makeNoise();

    abstract String roam();
}