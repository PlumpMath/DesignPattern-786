package zjj.dp.component.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 测试组合模式
 */
public class Client {

	public static void main(String[] args) {
		Component root = new Composite("root");
		Component c1 = new Composite("c1");
		Component leaf1 = new Composite("leaf1");
		Component leaf2 = new Composite("leaf2");
		Component leaf3 = new Composite("leaf3");
		root.add(c1);
		root.add(leaf1);
		c1.add(leaf2);
		c1.add(leaf3);
		
		root.operation();
	}
}
