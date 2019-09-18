package Zoo.Hao_Linus_Yuta;

public abstract class Pachyderm extends Animal {
    Pachyderm(final String name) {
        super(name);
    }

    @Override
    protected String roam() {
        return getName() + " is roaming" + " (Pachyderm)";
    }

    protected String wakeup() {
        return getName() + " is waking up just now (\"Stamp, stamp, Stamp\")";
    }
}
