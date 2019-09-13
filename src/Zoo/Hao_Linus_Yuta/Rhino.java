package Zoo.Hao_Linus_Yuta;

final class Rhino extends Pachyderm {

    public Rhino(String name) {

        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Mowwwwwww";
    }

    @Override
    public String toString() {
        return "Rhino [name=" + getName() + "]";
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
