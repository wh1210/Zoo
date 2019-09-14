package Zoo.Hao_Linus_Yuta;

final public class Tiger extends Feline {
    Tiger(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Woooo";
    }
}
