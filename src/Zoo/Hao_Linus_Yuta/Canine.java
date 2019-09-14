package Zoo.Hao_Linus_Yuta;

public abstract class Canine extends Animal {
    Canine(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " is roaming" + " (Canine)";
    }
}
