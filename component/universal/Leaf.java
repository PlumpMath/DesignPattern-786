package zjj.dp.component.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: р╤вс╫з╣Ц
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Error:Not Support!");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Error:Not Support!");	}

	@Override
	public Component getChild(int i) {
		System.out.println("Error:Not Support!");		
		return null;
	}

	@Override
	public void operation() {
		System.out.println("Leaf.operation:"+this.getName());
	}

}
