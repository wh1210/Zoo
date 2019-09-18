package Zoo.Hao_Linus_Yuta;

public abstract class Canine extends Animal {
    Canine(final String name) {
        super(name);
    }

    @Override
    protected String roam() {
        return getName() + " is roaming" + " (Canine)";
    }
}
