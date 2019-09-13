package Zoo.Hao_Linus_Yuta;

final class Dog extends Canine {

    public Dog(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Wang Wang";
    }

    @Override
    public String toString() {
        return "Dog [name=" + getName() + "]";
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