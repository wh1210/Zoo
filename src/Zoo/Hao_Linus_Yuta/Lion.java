package Zoo.Hao_Linus_Yuta;
/**
 * Create a Lion class which extend by Feline
 * override makeNoise() for Lion
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Lion extends Feline {
    Lion(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Aoooooo";
    }
}
