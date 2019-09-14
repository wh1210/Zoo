package Zoo.Hao_Linus_Yuta;

final class Elephant extends Pachyderm {

    Elephant(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is WYuuuuu";
    }
}
