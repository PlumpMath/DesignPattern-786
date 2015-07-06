package zjj.dp.abstractfactory.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: �̳��ڳ��󹤳������ɲ�Ʒ��2
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
