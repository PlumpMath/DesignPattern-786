package zjj.dp.decorate.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ╡Бйтв╟йндёй╫
 */
public class Client {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Component cda =  new ConcreteDecoratorA(c);
		Component cdb =  new ConcreteDecoratorB(cda);
		cdb.operation();
	}
}
