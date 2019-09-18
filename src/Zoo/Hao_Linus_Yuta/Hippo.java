package Zoo.Hao_Linus_Yuta;

public class Hippo extends Pachyderm {
    Hippo(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Mowww";
    }
}
