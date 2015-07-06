package zjj.dp.singleton.universal;
/*
 * author: zjj
 * date: 2015/4/18
 * func: ²âÊÔµ¥ÀýÄ£Ê½
 */
public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingle();
		Singleton s2 = Singleton.getSingle();
		s1.method();
		s2.method();
		if(s1 == s2) System.out.println("s1 equals s2!");
	}

}
