package Zoo.Hao_Linus_Yuta;

public class Dog extends Canine {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The dog " + name + " is Wang Wang";
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The dog " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The dog " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }
}