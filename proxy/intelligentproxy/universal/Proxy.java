package zjj.dp.proxy.intelligentproxy.universal;

public class Proxy extends Subject {
	private RealSubject realSubject;
	
	public Proxy() {
		this.realSubject = new RealSubject();
	}
	
	@Override
	public void request() {
		this.beforeRequest();
		realSubject.request();
		this.afterRequest();
	}
	
	public void beforeRequest() {
		System.out.println("Proxy.beforeRequest");
	}
	
	public void afterRequest() {
		System.out.println("Proxy.afterRequest");
	}
}
