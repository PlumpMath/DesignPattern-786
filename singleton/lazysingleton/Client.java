package zjj.dp.singleton.lazysingleton;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ≤‚ ‘¿¡∫∫µ•¿˝ƒ£ Ω
 */
public class Client {

	public static void main(String[] args) {
		LazySingleton s1 = LazySingleton.getInstance();
		LazySingleton s2 = LazySingleton.getInstance();
		if(s1 == s2) System.out.println("s1 equals s2!");
	}

}
