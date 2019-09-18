package Zoo.Hao_Linus_Yuta;

public abstract class Feline extends Animal {
    Feline(final String name) {
        super(name);
    }

    @Override
    protected String roam() {
        return getName() + " is roaming" + " (Feline)";
    }
}
