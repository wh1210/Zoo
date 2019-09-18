package Zoo.Hao_Linus_Yuta;

public class Dog extends Canine {
    Dog(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Wang Wang";
    }
}