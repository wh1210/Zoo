package Zoo.Hao_Linus_Yuta;

public class Tiger extends Feline {
    public String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The tiger " + name + " is Woooo";
    }

    @Override
    public String toString() {
        return "Tiger [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The tiger " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The tiger " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
