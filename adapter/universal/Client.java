package zjj.dp.adapter.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ²âÊÔÊÊÅäÆ÷Ä£Ê½
 */
public class Client {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.method();
	}

}
