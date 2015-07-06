package zjj.dp.decorate.example;
/*
 * author: zjj
 * date: 2015/5/15
 * func: װ���࣬�̳�Component�࣬������Component����
 */
public abstract class Decorator implements Component{
	protected Component component;
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	public abstract void addBehavior();
}
