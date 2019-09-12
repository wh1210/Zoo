package Zoo.Hao_Linus_Yuta;

public class Cat extends Feline {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The cat " + name + " is Miao";
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The cat " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The cat " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
