package zjj.dp.simplefactory.universal;

import zjj.dp.simplefactory.util.XMLUtil;


/*
 * author: zjj
 * date: 2015/5/6
 * func: ���Լ򵥹���ģʽ
 * �����ļ�Ϊconfig.xml
 */
public class Client {

	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		String type = XMLUtil.getProductType();
		IProduct product = factory.createProduct(type);
		product.method();
	}

}
