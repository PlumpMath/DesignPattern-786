package zjj.dp.abstractfactory.universal;
/*
 * author: zjj
 * date: 2015/5/7
 * func: 测试生产windows,linux皮肤界面的抽象工厂模式
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory1 = new Product1Factory(); 
		AbstractFactory factory2 = new Product2Factory(); 
		ProductA1 productA1 = (ProductA1) factory1.createProductA();
		ProductA2 productA2 = (ProductA2) factory2.createProductA();
		
		ProductB1 productB1 = (ProductB1) factory1.createProductB();
		ProductB2 productB2 = (ProductB2) factory2.createProductB();
		
		productA1.doSomething();
		productA2.doSomething();
		productB1.doSomething();
		productB2.doSomething();
	}

}
