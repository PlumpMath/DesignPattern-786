package zjj.dp.proxy.intelligentproxy.example;

public class ProxySearcher implements ISearcher {
	private RealSearcher realSearcher;
	private AccessValidator accessValidator;
	Logger logger;
	
	public ProxySearcher() {
		this.realSearcher = new RealSearcher();
		this.logger = new Logger();
		this.accessValidator = new AccessValidator();
	}
	
	@Override
	public void search(String userid, String password,String key) {
		if(accessValidator.validate(userid,password))
		{
			this.realSearcher.search(userid,password,key);
			this.logger.Log(userid);
		}else {
			System.out.println("ÓÃ»§ÃûÃÜÂë´íÎó£¡");
		}
	}

}
