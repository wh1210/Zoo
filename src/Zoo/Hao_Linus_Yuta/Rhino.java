package Zoo.Hao_Linus_Yuta;

public class Rhino extends Pachyderm {
    Rhino(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Mowwwwwww";
    }
}
