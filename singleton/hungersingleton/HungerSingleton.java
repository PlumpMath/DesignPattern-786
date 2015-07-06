package zjj.dp.singleton.hungersingleton;
/*
 * author: zjj
 * date: 2015/5/6
 * func: ¶öººµ¥ÀýÄ£Ê½
 */
public class HungerSingleton {
	private static final HungerSingleton hungerSingleton = new HungerSingleton();
	
	private HungerSingleton() {
		
	}
	
	public static HungerSingleton getInstance() {
		return hungerSingleton;
	}
}
