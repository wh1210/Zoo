package Zoo.Hao_Linus_Yuta;

public class Lion extends Feline {
    Lion(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Aoooooo";
    }
}
