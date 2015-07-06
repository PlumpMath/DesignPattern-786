package zjj.dp.singleton.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: 单例模式
 */

public class Singleton {
	private static final Singleton singleton = new Singleton();
	private String property;
	
	//构造方法私有化
	private Singleton()
	{
	}
	
	public static Singleton getSingle()
	{
		return singleton;
	}
	
	public void method()
	{
		System.out.println("Single method!");
	}	
}
