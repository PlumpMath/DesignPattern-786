package zjj.dp.proxy.dynamicproxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * author: zjj
 * date: 2015/5/16
 * func: 动态代理模式示例，动态代理DAO使用日志记录调用时间和结果
 */
public class Client {

	public static void main(String[] args) {
		InvocationHandler handler = null;
		try{
			IUserDao userDao = new UserDao();
			handler = new DAOLogHandler(userDao);
			IUserDao proxy = null;
			proxy = (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(), new Class[]{IUserDao.class}, handler);
			proxy.findUserById("zjj");
			
			IDocumentDao docDao = new DocumentDao();
			handler = new DAOLogHandler(docDao);
			IDocumentDao proxy2 = null;
			proxy2 = (IDocumentDao) Proxy.newProxyInstance(IDocumentDao.class.getClassLoader(), new Class[]{IDocumentDao.class}, handler);
			proxy2.deleteDocumentById("002");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
