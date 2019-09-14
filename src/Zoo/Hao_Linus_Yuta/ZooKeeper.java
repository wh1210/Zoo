package Zoo.Hao_Linus_Yuta;

import java.util.ArrayList;

final class ZooKeeper {
    void wake(ArrayList<Animal> animals) {
        System.out.println("The zookeeper is waking up animals");
        for (Animal animal : animals) {
            System.out.println(animal.wakeup());
        }
    }

    void rollCall(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is rolling call animals");
        for (Animal animal : animals) {
            System.out.println(animal.makeNoise());
        }
    }

    void feed(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is feeding animals");
        for (Animal animal : animals) {
            System.out.println(animal.eat());
        }
    }

    void exercise(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is exercising animals");
        for (Animal animal : animals) {
            System.out.println(animal.roam());
        }
    }

    void shutdown(ArrayList<Animal> animals) {
        System.out.println("\nThe zookeeper is shutting down the zoo");
        for (Animal animal : animals) {
            System.out.println(animal.sleep());
        }
    }
}
