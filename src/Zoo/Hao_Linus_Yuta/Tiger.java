package Zoo.Hao_Linus_Yuta;

public class Tiger extends Feline {
    Tiger(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Woooo";
    }
}
