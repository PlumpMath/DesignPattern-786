package zjj.dp.bridge.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ≤‚ ‘  ≈‰∆˜ƒ£ Ω
 */
public class Client {

	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(implementor);
		abstraction.abs_method();
	}
}
