package zjj.dp.singleton.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ����ģʽ
 */

public class Singleton {
	private static final Singleton singleton = new Singleton();
	private String property;
	
	//���췽��˽�л�
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
