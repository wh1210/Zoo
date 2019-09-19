package Zoo.Hao_Linus_Yuta;

/**
 * Create a abstract Canine class which extend by Animal for each Canine animal in Zoo
 * overide the roam() method for Canine animals
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public abstract class Canine extends Animal {
    Canine(final String name) {
        super(name);
    }

    @Override
    protected String roam() {
        return getName() + " is roaming" + " (Canine)";
    }
}
