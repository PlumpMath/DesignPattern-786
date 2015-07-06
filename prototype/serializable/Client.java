package zjj.dp.prototype.serializable;

import zjj.dp.simplefactory.util.XMLUtil;

/*
 * author: zjj
 * date: 2015/5/6
 * func: 测试原型模式中的深克隆，通过实现Serializable
 */
public class Client {
	public static void main(String[] args) {
		PrototypeManager propMgr = PrototypeManager.getPrototypeManager();
		ProductA pa1 = (ProductA) propMgr.getProduct("A");
		ProductA pa2 = (ProductA) propMgr.getProduct("A");
		pa1.method();
		pa2.method();
		if(pa1 == pa2)
		{
			System.out.println("pa1 == pa2");
		}
		else {
			System.out.println("pa1 != pa2");
		}
		
		ProductB pb1 = (ProductB) propMgr.getProduct("B");
		ProductB pb2 = (ProductB) propMgr.getProduct("B");
		pb1.method();
		pb2.method();
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
			System.out.println("pb1.productA == pb2.productA");
		}
		else {
			System.out.println("实现深克隆！");
			System.out.println("pb1.productA != pb2.productA");
		}
	}
}
