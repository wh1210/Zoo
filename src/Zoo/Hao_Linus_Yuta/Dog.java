package Zoo.Hao_Linus_Yuta;

/**
 * Create a Dog class which extend by Canine
 * override makeNoise() for Dog
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Dog extends Canine {
    Dog(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Wang Wang";
    }
}