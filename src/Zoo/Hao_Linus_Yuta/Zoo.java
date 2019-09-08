package Zoo.Hao_Linus_Yuta;

import java.util.ArrayList;

public class Zoo {
	public static void main(String[] args) {
		ArrayList<Animals> animals = initializeZoo();
		ZooKeeper zookeeper = new ZooKeeper();
		zookeeper.wake(animals);
		zookeeper.rollCall(animals);
		zookeeper.feed(animals);
		zookeeper.exercise(animals);
		zookeeper.shutdown(animals);
	}
	
	public static ArrayList<Animals> initializeZoo() {
		ArrayList<Animals> animals = new ArrayList<>();
		animals.add(new Cat("cat1"));
		animals.add(new Cat("cat2"));
		animals.add(new Hippo("hippo1"));
		animals.add(new Hippo("hippo2"));
		animals.add(new Rhino("rhino1"));
		animals.add(new Rhino("rhino2"));
		animals.add(new Elephant("elephant1"));
		animals.add(new Elephant("elephant2"));
		animals.add(new Tiger("tiger1"));
		animals.add(new Tiger("tiger2"));
		animals.add(new Lion("lion1"));
		animals.add(new Lion("lion2"));
		animals.add(new Wolf("wolf1"));
		animals.add(new Wolf("wolf2"));
		animals.add(new Dog("dog1"));
		animals.add(new Dog("dog2"));
		return animals;
	}
}