package zjj.dp.factory.universal;

/*
 * author: zjj
 * date: 2015/4/18
 * func: ����ģʽ,ʹ�÷�����ƻ�ȡ��ʵ��
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
