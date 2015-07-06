package zjj.dp.decorate.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 装饰类，继承Component类，并持有Component引用
 */
public abstract class Decorator implements Component{
	protected Component component;
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	public abstract void operation();
}
