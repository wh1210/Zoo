package Zoo.Hao_Linus_Yuta;

import java.util.ArrayList;

public class ZooKeeper {
    public void wake(ArrayList<Animals> animals) {
        System.out.println("The zookeeper is waking up animals");
        for (Animals animal : animals) {
            System.out.println(animal.wakeup());
        }
    }

    public void rollCall(ArrayList<Animals> animals) {
        System.out.println("The zoomkeeper is rolling call animals");
        for (Animals animal : animals) {
            System.out.println(animal.makeNoise());
        }
    }

    public void feed(ArrayList<Animals> animals) {
        System.out.println("The zoomkeeper is feeding animals");
        for (Animals animal : animals) {
            System.out.println(animal.eat());
        }
    }

    public void exercise(ArrayList<Animals> animals) {
        System.out.println("The zoomkeeper is exercising animals");
        for (Animals animal : animals) {
            System.out.println(animal.roam());
        }
    }

    public void shutdown(ArrayList<Animals> animals) {
        System.out.println("The zoomkeeper is shuting down the zoo");
        for (Animals animal : animals) {
            System.out.println(animal.sleep());
        }
    }
}
