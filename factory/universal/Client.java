package zjj.dp.factory.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ���Թ���ģʽ
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = new ProductFactory();
		IProduct productA = factory.createProduct(ProductA.class);
		IProduct productB = factory.createProduct(ProductB.class);
		productA.methodA();
		productA.methodB();
		productB.methodA();
		productB.methodB();
	}

}
