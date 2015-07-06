package zjj.dp.decorate.example;

public class ScrollBarDecorator extends Decorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		this.addBehavior();
		this.component.display();
	}

	@Override
	public void addBehavior() {
		System.out.println("add ScrollBar");
	}

}
