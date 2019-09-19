package Zoo.Hao_Linus_Yuta;
/**
 * Create a Hippo class which extend by Pachyderm
 * overide makeNoise() for Hippo
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Hippo extends Pachyderm {
    Hippo(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Mowww";
    }
}
