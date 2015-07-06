package zjj.dp.singleton.IoDHsingleton;
/*
 * author: zjj
 * date: 2015/5/6
 * func: ²âÊÔIoDHµ¥ÀýÄ£Ê½
 */
public class Client {

	public static void main(String[] args) {
		IoDHSingleton s1 = IoDHSingleton.getInstance();
		IoDHSingleton s2 = IoDHSingleton.getInstance();
		if(s1 == s2) System.out.println("s1 equals s2!");
	}

}
