package zjj.dp.observer.example.ally;

import java.util.LinkedList;
import java.util.List;

public class AllyCenter extends Subject {
	private String allyName;
	private List<IObserver> members;
	
	public AllyCenter(String allyName) {
		this.allyName = allyName;
		this.members = new LinkedList<IObserver>();
	}

	@Override
	public void add(IObserver observer) {
		members.add(observer);
	}

	@Override
	public void notifyPlayer(String name) {
		System.out.println("The Ally notice:"+name+" has been attacked!");
		for(IObserver observer:members){
			if(!observer.getName().equals(name)) observer.help();
		}
	}

	@Override
	public void remove(IObserver observer) {
		members.remove(observer);
	}

	@Override
	public void joinPlayer(IObserver observer) {
		System.out.println(observer.getName()+" join ally!");
		members.add(observer);
	}
}
