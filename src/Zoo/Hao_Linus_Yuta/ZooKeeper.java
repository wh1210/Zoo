package Zoo.Hao_Linus_Yuta;

import java.util.ArrayList;

final class ZooKeeper {
    protected void wake(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is waking up animals");
        for (Animals animal : animals) {
            System.out.println(animal.wakeup());
        }
    }

    protected void rollCall(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is rolling call animals");
        for (Animals animal : animals) {
            System.out.println(animal.makeNoise());
        }
    }

    protected void feed(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is feeding animals");
        for (Animals animal : animals) {
            System.out.println(animal.eat());
        }
    }

    protected void exercise(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is exercising animals");
        for (Animals animal : animals) {
            System.out.println(animal.roam());
        }
    }

    public void shutdown(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is shutting down the zoo");
        for (Animals animal : animals) {
            System.out.println(animal.sleep());
        }
    }
}
