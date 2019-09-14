package Zoo.Hao_Linus_Yuta;

final class Wolf extends Canine {
    Wolf(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Aooooo";
    }
}
