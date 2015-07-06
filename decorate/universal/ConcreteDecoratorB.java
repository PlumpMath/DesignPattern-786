package zjj.dp.decorate.universal;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		this.component.operation();
		System.out.println("ConcreteDecoratorB.operation");
	}

}
