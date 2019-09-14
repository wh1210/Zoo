package Zoo.Hao_Linus_Yuta;

final class Lion extends Feline {
    Lion(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Aoooooo";
    }
}
