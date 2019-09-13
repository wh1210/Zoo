package Zoo.Hao_Linus_Yuta;

import java.util.Random;

final class Cat extends Feline {

    public Cat(String name) {
        setName(name);
    }

    @Override
    public String makeNoise() {
        // Randomly call function
        Random r = new Random();
        int randomInt = r.nextInt(3);
        switch (randomInt){
            case 0: return meow();
            case 1: return layDown();
            case 2: return sharpenClaws();
            default: return layDown();
        }
    }

    private String meow() {
        return "The " + getObjName() + " " + getName() + " is meowing";
    }

    private String layDown() {
        return "The " + getObjName() + " " + getName() + " is laying down.";
    }

    private String sharpenClaws(){
        return "The " + getObjName() + " " + getName() + " is sharpening claws.";
    }

    @Override
    public String toString() {
        return "Cat [name=" + getName() + "]";
    }

    @Override
    public String eat() {
        return "The " + getObjName() + " " + getName() + " is eating";
    }

    @Override
    public String wakeup() {
        return "The " + getObjName() + " " + getName() + " waked up just now";
    }
}
