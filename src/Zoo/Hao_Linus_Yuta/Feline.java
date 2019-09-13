package Zoo.Hao_Linus_Yuta;

public abstract class Feline extends Animal {

    @Override
    public String roam() {
        return "The " + getObjName() + " " + getName() + " is roaming";
    }
}
