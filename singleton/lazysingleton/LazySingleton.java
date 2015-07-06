package zjj.dp.singleton.lazysingleton;
/*
 * author: zjj
 * date: 2015/5/6
 * func: ÀÁººµ¥ÀýÄ£Ê½
 */
public class LazySingleton {
	private volatile static LazySingleton lazySingleton = null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(lazySingleton == null){
			synchronized(LazySingleton.class) {
				if(lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
