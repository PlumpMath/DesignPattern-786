package zjj.dp.decorate.universal;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		this.component.operation();
		System.out.println("ConcreteDecoratorA.operation");
	}

}
