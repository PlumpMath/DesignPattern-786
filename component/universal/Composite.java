package zjj.dp.component.universal;

import java.util.ArrayList;
import java.util.List;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ÈÝÆ÷½Úµã
 */
public class Composite extends Component {
	
	private List<Component> list = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		return list.get(i);
	}

	@Override
	public void operation() {
		System.out.println("Composite.operation:"+this.getName());
		for(Component c:list) {
			c.operation();
		}
	}

}
