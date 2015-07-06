package zjj.dp.decorate.universal;
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

	public abstract void operation();
}
