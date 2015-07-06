package zjj.dp.proxy.intelligentproxy.example;

public class RealSearcher implements ISearcher {

	@Override
	public void search(String userid,String password, String key) {
		System.out.println(userid +"≤È—Ø"+key);
	}

}
