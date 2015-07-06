package zjj.dp.interpreter.example.charactercommand;
/*
 * author: zjj
 * date: 2015/6/5
 * func: 解释器模式实例，简单语言指令LOOP PRINT SPACE BREAK等等
 */
public class Client {

	public static void main(String[] args) {
		String text = "LOOP 3 LOOP 2 PRINT 解释器模式 SPACE PRINT 行为型模式 BREAK END PRINT 设计模式 BREAK END";
		Context context = new Context(text);
		
		INode node = new ExpressionNode();
		node.interpret(context);
		node.execute();
	}
}
