package zjj.dp.command.universal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * author: zjj
 * date: 2015/5/17
 * func: 命令模式基本模型
 */
public class Client {

	public static void main(String[] args) {
		Reciver reciver = new Reciver();
		ICommand command = new ConcreteCommand(reciver);
		Invoker invoker = new Invoker(command);
		invoker.call();
	}
}
