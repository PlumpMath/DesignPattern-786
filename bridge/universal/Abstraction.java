package zjj.dp.bridge.universal;
/*
 * author: zjj
 * date: 2015/5/15
 * func: �����࣬ע��ʵ����ӿ�
 */
public abstract class Abstraction {
	protected Implementor implementor;
	
	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public abstract void abs_method();
}
