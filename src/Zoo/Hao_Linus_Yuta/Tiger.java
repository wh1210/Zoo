package Zoo.Hao_Linus_Yuta;
/**
 * Create a Tiger class which extend by Feline
 * overide makeNoise() for Tiger
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Tiger extends Feline {
    Tiger(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Woooo";
    }
}
