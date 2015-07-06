package zjj.dp.simplefactory.universal;
/*
 * author: zjj
 * date: 2015/5/6
 * func: �򵥹���ģʽ
 */
public class SimpleFactory {
	public static IProduct createProduct(String type) {
		IProduct product = null;
		if(type.equals("A")) {
			product = new ProductA();
		}else if(type.equals("B")) {
			product = new ProductB();
		}
		return product;
	}
}
