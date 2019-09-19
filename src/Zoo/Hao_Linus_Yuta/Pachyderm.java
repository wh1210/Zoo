package Zoo.Hao_Linus_Yuta;

/**
 * Create a abstract Pachyderm class which extend by Animal for each Pyachydrem animal in Zoo
 * override roam() and wakeup() methods for Pachyderm's subclasses
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
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
