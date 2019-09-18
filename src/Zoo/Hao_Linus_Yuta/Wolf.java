package Zoo.Hao_Linus_Yuta;

class Wolf extends Canine {
    Wolf(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is Aooooo";
    }
}
