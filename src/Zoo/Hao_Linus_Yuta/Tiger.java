package Zoo.Hao_Linus_Yuta;

final public class Tiger extends Feline {

    public Tiger(String name) {

        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Woooo";
    }

    @Override
    public String toString() {
        return "The " + getObjName() + " " + getName() + "]";
    }

    @Override
    public String eat() {
        return "The " + getObjName() + " " + getName() + " is eating";
    }

    @Override
    public String wakeup() {
        return "The " + getObjName() + " " + getName() + " waked up just now";
    }
}
