package Zoo.Hao_Linus_Yuta;

public class Lion extends Feline {
	public String name;
	
	public Lion(String name) {
		this.name = name;
	}
	
	@Override
	public String makeNoise() {
		return "The lion " + name + " is Aoooooo";
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + "]";
	}

	@Override
	public String eat() {
		return "The lion " + name + " is eating";
	}

	@Override
	public String wakeup() {
		return "The lion " + name + " waked up just now";
	}

	@Override
	public String getName() {
		return this.name;
	}
}
