package zjj.dp.decorate.example;

public class BlackBorderDecorator extends Decorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		this.addBehavior();
		this.component.display();
	}

	@Override
	public void addBehavior() {
		System.out.println("add BlackBorder");
	}

}
