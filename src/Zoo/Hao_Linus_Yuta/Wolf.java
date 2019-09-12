package Zoo.Hao_Linus_Yuta;

public class Wolf extends Canine {

    public String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The wolf " + name + " is Aooooo";
    }

    @Override
    public String toString() {
        return "Wolf [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The wolf " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The wolf " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }

}
