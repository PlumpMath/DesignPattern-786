package zjj.dp.prototype.clone;

import java.util.HashMap;

/*
 * author: zjj
 * date: 2015/5/13
 * func: 原型生成管理器，使用饿汉单例
 */
public class PrototypeManager {
	IProduct product;
	public static final PrototypeManager prototypeMgr = new PrototypeManager();
	public static HashMap<String,IProduct> map;
	
	static {
		map = new HashMap<String,IProduct>();
		ProductA productA = new ProductA("propA");
		ProductB productB = new ProductB("propB",productA);
		map.put("A", productA);
		map.put("B", productB);
	}
	
	private PrototypeManager(){
		
	}
	
	public static PrototypeManager getPrototypeManager()
	{
		return prototypeMgr;
	}
	
	public void addProduct(IProduct product,String productName)
	{
		map.put(productName, product);
	}
	
	public IProduct getProduct(String productName)
	{
		IProduct product = map.get(productName);
		return product.clone();
	}
}
