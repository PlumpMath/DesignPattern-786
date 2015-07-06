package zjj.dp.interpreter.example.robot;
/*
 * author: zjj
 * date: 2015/6/4
 * func: 解释器模式实例，控制机器人移动的指令的文法规则类设计与语言解释实现
 */
public class Client {

	public static void main(String[] args) {
		String command = "up fast 5 and left slow 4 and down normal 1";
		InterpreterHandler handler = new InterpreterHandler(command);
		INode node = handler.handle();
		String result = handler.output(node);
		System.out.println(result);
	}
}
