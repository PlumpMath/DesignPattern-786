package zjj.dp.singleton.hungersingleton;


/*
 * author: zjj
 * date: 2015/5/6
 * func: ≤‚ ‘¿¡∫∫µ•¿˝ƒ£ Ω
 */
public class Client {

	public static void main(String[] args) {
		HungerSingleton s1 = HungerSingleton.getInstance();
		HungerSingleton s2 = HungerSingleton.getInstance();
		if(s1 == s2) System.out.println("s1 equals s2!");
	}

}
