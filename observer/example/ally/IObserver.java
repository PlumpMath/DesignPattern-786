package zjj.dp.observer.example.ally;

public interface IObserver {
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(Subject allyCenter);
}
