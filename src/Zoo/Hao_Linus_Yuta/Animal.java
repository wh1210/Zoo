package Zoo.Hao_Linus_Yuta;

public abstract class Animal implements Animals {
    private String name;

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getObjName() {
        return getClass().getSimpleName();
    }

    public String sleep() {
        return "The " + getClass().getSimpleName() + " " + name + " is sleeping";
    }
}