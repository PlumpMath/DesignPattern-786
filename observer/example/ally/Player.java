package zjj.dp.observer.example.ally;

public class Player implements IObserver {
	private String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void help() {
		System.out.println(name+" comes to help!");
	}

	@Override
	public void beAttacked(Subject allyCenter) {
		System.out.println(name+" be attacked!");
		allyCenter.notifyPlayer(this.name);
	}
}
