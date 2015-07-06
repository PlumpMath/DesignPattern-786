package zjj.dp.adapter.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 适配器类，持有适配者引用
 */
public class Adapter implements Target {
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void method() {	
		adaptee.method1();
	}

}
