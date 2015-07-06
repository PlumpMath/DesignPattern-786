package zjj.dp.responsibilitychain.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * author: zjj
 * date: 2015/5/17
 * func: 职责链模式实例,分级审批的实现
 */
public class Client {

	public static void main(String[] args) {
		PurchaseRequest purchaseRequest = new PurchaseRequest(55000,1001,"purchase OA System");
		AbstractHandler dir_handler = new DirectorHandler();
		AbstractHandler vp_handler = new VicePresidentHandler();
		AbstractHandler p_handler = new PresidentHandler();
		dir_handler.setHandler(vp_handler);
		vp_handler.setHandler(p_handler);
		dir_handler.handle(purchaseRequest);
	}
}
