package zjj.dp.factory.universal;

/*
 * author: zjj
 * date: 2015/4/18
 * func: 工厂模式,使用反射机制获取类实例
 */
public class ProductFactory extends AbstractFactory{

	@Override
	public <T extends IProduct> T createProduct(Class<T> c) {
		IProduct product = null;
		try {
			product = (IProduct) Class.forName(c.getName()).newInstance();
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T)product;
	}
	
}
