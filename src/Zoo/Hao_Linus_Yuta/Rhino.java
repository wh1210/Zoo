package Zoo.Hao_Linus_Yuta;

final class Rhino extends Pachyderm {
    Rhino(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Mowwwwwww";
    }
}
