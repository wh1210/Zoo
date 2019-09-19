package Zoo.Hao_Linus_Yuta;
/**
 * Create a Wolf class which extend by Canine
 * overide makeNoise() for Wolf
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Wolf extends Canine {
    Wolf(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Aooooo";
    }
}
