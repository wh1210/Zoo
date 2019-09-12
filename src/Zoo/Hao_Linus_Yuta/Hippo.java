package Zoo.Hao_Linus_Yuta;

public class Hippo extends Pachyderm {

    public String name;

    public Hippo(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "The Hippo " + name + " is Mowww";
    }

    @Override
    public String toString() {
        return "Hippo [name=" + name + "]";
    }

    @Override
    public String eat() {
        return "The hippo " + name + " is eating";
    }

    @Override
    public String wakeup() {
        return "The hippo " + name + " waked up just now";
    }

    @Override
    public String getName() {
        return this.name;
    }

}
