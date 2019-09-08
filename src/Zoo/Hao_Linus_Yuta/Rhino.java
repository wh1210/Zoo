package Zoo.Hao_Linus_Yuta;

public class Rhino extends Pachyderm {
	public String name;
	
	public Rhino(String name) {
		this.name = name;
	}
	
	@Override
	public String makeNoise() {
		return "The Rhino " + name + " is Mowwwwwww";
	}

	@Override
	public String toString() {
		return "Rhino [name=" + name + "]";
	}

	@Override
	public String eat() {
		return "The rhino " + name + " is eating";
	}

	@Override
	public String wakeup() {
		return "The rhino " + name + " waked up just now";
	}

	@Override
	public String getName() {
		return this.name;
	}

}
