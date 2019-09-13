package Zoo.Hao_Linus_Yuta;

final class Cat extends Feline {

    public Cat(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        return "The " + getObjName() + " " + getName() + " is Miao";
    }

    @Override
    public String toString() {
        return "Cat [name=" + getName() + "]";
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
