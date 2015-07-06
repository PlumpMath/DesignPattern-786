package zjj.dp.flyweight.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: 享元类，区分内部状态和外部状态
 */
public abstract class FlyWeight {
	protected String intrinsic;
	public abstract void operation(String extrinsic);
}
