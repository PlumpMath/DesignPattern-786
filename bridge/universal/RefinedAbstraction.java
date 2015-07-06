package zjj.dp.bridge.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: ¿©≥‰≥ÈœÛ¿‡
 */
public class RefinedAbstraction extends Abstraction {

	public void abs_method() {
		System.out.println("RefinedAbstraction.abs_method");
		this.implementor.imp_method();
		
	}

}
