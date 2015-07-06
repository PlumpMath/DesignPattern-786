package zjj.dp.abstractfactory.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: 抽象工厂,定义一个产品族生产线
 */
public abstract class AbstractFactory {
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}
