package Zoo.Hao_Linus_Yuta;

final class Wolf extends Canine {


    public Wolf(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Aooooo";
    }

    @Override
    public String toString() {
        return "Wolf [name=" + getName() + "]";
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
