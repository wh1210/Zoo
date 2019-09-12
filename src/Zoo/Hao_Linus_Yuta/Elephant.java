package Zoo.Hao_Linus_Yuta;

public class Elephant extends Pachyderm {

    public String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The elephant " + name + " is WYuuuuu";
    }

    @Override
    public String toString() {
        return "Elephant [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The elephant " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The elephant " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
