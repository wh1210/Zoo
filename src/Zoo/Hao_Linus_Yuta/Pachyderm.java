package Zoo.Hao_Linus_Yuta;

public abstract class Pachyderm extends Animal {
    Pachyderm(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " is roaming" + " (Pachyderm)";
    }

    public String wakeup() {
        return getName() + " is waking up just now (\"Stamp, stamp, Stamp\")";
    }
}
