package Zoo.Hao_Linus_Yuta;

/**
 * Create a Elephant class which extend by Pachyderm
 * overide makeNoise() for Elephant
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class Elephant extends Pachyderm {
    Elephant(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is WYuuuuu";
    }
}
