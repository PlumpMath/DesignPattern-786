package zjj.dp.prototype.clone;

import zjj.dp.simplefactory.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/13
 * func: 测试原型模式中的浅克隆，通过Object的clone方法
 */
public class Client {

	public static void main(String[] args) {
		PrototypeManager mgr = PrototypeManager.getPrototypeManager();
		ProductA pa1 = (ProductA) mgr.getProduct("A");
		ProductA pa2 = (ProductA) mgr.getProduct("A");
		
		ProductB pb1 = (ProductB) mgr.getProduct("B");
		ProductB pb2 = (ProductB) mgr.getProduct("B");
		
		pa1.method();
		pb1.method();
		if(pa1 == pa2)
		{
			System.out.println("pa1 == pa2");
		}
		else {
			System.out.println("pa1 != pa2");
		}
		
		if(pb1 == pb2)
		{
			System.out.println("pb1 == pb2");
		}
		else {
			System.out.println("实现克隆！");
			System.out.println("pb1 != pb2");
		}
		
		if(pb1.productA == pb2.productA)
		{
			System.out.println("实现浅克隆！");
			System.out.println("pb1.productA == pb2.productA");
		}
		else {
			System.out.println("实现深克隆！");
			System.out.println("pb1.productA != pb2.productA");
		}
	}
}
