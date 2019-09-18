package Zoo.Hao_Linus_Yuta;

final class Elephant extends Pachyderm {

    Elephant(final String name) {
        super(name);
    }

    @Override
    protected String makeNoise() {
        return getName() + " is WYuuuuu";
    }
}
