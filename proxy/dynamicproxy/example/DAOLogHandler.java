package zjj.dp.proxy.dynamicproxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAOLogHandler implements InvocationHandler {
	private Object object;
	private Calendar calendar;
	
	public DAOLogHandler(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		this.beforeInvoke();
		Object result = method.invoke(object, args);
		this.afterInvoke();
		return null;
	}

	public void beforeInvoke() {
		calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour+":"+minute+":"+second;
		System.out.println("调用时间："+time);
	}
	public void afterInvoke() {
		System.out.println("调用成功");
	}
}
