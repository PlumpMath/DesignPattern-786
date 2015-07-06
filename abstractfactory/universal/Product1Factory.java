package zjj.dp.abstractfactory.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: �̳��ڳ��󹤳������ɲ�Ʒ��1
 */
public class Product1Factory extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
