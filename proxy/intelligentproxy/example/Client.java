package zjj.dp.proxy.intelligentproxy.example;


/*
 * author: zjj
 * date: 2015/5/15
 * func: 代理模式示例，为查询类添加鉴权和写日志
 */
public class Client {

	public static void main(String[] args) {
		ProxySearcher proxySearcher = new ProxySearcher();
		proxySearcher.search("zjj", "111","bcl");
	}
}
