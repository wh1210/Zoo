package Zoo.Hao_Linus_Yuta;

final class Dog extends Canine {

    Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " is Wang Wang";
    }
}