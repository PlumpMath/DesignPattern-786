package zjj.dp.component.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ³éÏó×é¼þ
 */
public abstract class Component {
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract Component getChild(int i);
	public abstract void operation();
}
