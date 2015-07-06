package zjj.dp.observer.example.ally;

import java.util.List;

public abstract class Subject {
	public abstract void add(IObserver observer);
	public abstract void notifyPlayer(String name);
	public abstract void remove(IObserver observer);
	public abstract void joinPlayer(IObserver observer);
}
