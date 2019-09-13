package Zoo.Hao_Linus_Yuta;

final class Hippo extends Pachyderm {


    public Hippo(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Mowww";
    }

    @Override
    public String toString() {
        return "Hippo [name=" + getName() + "]";
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
