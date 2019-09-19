package Zoo.Hao_Linus_Yuta;

import java.util.ArrayList;

/**
 * Creat a ZooKeeper class for hold each animals in Zoo
 * set each methods that ZooKeeper should do
 * @author Hao_Yuta_Linus
 * @since 2019-09-18
 */
public class ZooKeeper {
    protected void wake(ArrayList<Animal> animals) {
        System.out.println("The zookeeper is waking up animals");
        for (Animal animal : animals) {
            System.out.println(animal.wakeup());
        }
    }

    protected void rollCall(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is rolling call animals");
        for (Animal animal : animals) {
            System.out.println(animal.makeNoise());
        }
    }

    protected void feed(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is feeding animals");
        for (Animal animal : animals) {
            System.out.println(animal.eat());
        }
    }

    protected void exercise(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is exercising animals");
        for (Animal animal : animals) {
            System.out.println(animal.roam());
        }
    }

    protected void shutdown(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is shutting down the zoo");
        for (Animal animal : animals) {
            System.out.println(animal.sleep());
        }
    }
}
