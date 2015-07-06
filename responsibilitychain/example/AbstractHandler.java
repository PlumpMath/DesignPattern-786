package zjj.dp.responsibilitychain.example;
/*
 * author: zjj
 * date: 2015/5/17
 * func: 抽象分发者，持有下一级处理者的引用
 */
public abstract class AbstractHandler {
	protected AbstractHandler successor;

	public void setHandler(AbstractHandler successor) {
		this.successor = successor;
	}
	
	public abstract void handle(PurchaseRequest request);
}
