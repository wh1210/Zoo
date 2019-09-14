package Zoo.Hao_Linus_Yuta;

final class Hippo extends Pachyderm {
    Hippo(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Mowww";
    }
}
