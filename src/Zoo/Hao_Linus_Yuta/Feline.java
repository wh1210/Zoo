package Zoo.Hao_Linus_Yuta;

public abstract class Feline extends Animal {
    Feline(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " is roaming" + " (Feline)";
    }
}
