package zjj.dp.iterator.example.productlist;

import java.util.ArrayList;
import java.util.List;

/*
 * author: zjj
 * date: 2015/6/6
 * func:迭代器模式实例，对商品集合进行迭代
 * notice:有个bug,remove元素后，指向末尾的cursor2越界
 */
public class Client {

	public static void main(String[] args) {
		List products = new ArrayList();
		products.add("milk1");
		products.add("milk2");
		products.add("bread1");
		products.add("bread2");
		
		IObjectList productList = new ProductList(products);
		Iterator iterator = productList.createIterator();
		
		System.out.println("正序遍历：");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println("");
		System.out.println("---------------------");
		
		System.out.println("逆序遍历：");
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
	}
}
