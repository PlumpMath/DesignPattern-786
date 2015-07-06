package zjj.dp.responsibilitychain.example;
/*
 * author: zjj
 * date: 2015/5/17
 * func: ����ַ��ߣ�������һ�������ߵ�����
 */
public abstract class AbstractHandler {
	protected AbstractHandler successor;

	public void setHandler(AbstractHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handle(PurchaseRequest request);
}
