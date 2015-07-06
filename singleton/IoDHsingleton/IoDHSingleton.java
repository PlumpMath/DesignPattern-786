package zjj.dp.singleton.IoDHsingleton;

import zjj.dp.singleton.lazysingleton.LazySingleton;
/*
 * author: zjj
 * date: 2015/5/6
 * func: IoDHµ¥ÀýÄ£Ê½
 */
public class IoDHSingleton {
	private IoDHSingleton(){
		
	}	
	
	private static class HolderClass
	{
		public static final IoDHSingleton instance = new IoDHSingleton();
	}
	
	public static IoDHSingleton getInstance() {
		return HolderClass.instance;
	}
}
