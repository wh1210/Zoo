package Zoo.Hao_Linus_Yuta;

final class Lion extends Feline {

    public Lion(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Aoooooo";
    }

    @Override
    public String toString() {
        return "Lion [name=" + getName() + "]";
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
