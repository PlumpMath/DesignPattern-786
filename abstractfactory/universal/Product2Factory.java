package zjj.dp.abstractfactory.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: 继承于抽象工厂，生成产品族2
 */
public class Product2Factory extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
