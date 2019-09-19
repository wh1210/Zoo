package Zoo.Hao_Linus_Yuta;
/**
 * Create a Rhino class which extend by Pachyderm
 * override makeNoise() for Rhino
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Rhino extends Pachyderm {
    Rhino(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Mowwwwwww";
    }
}
