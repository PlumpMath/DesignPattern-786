package zjj.dp.interpreter.example.charactercommand;

public class LoopNode implements INode {
	private int number;
	private INode commandNode;
	
	@Override
	public void interpret(Context context) {
		context.skipToken("LOOP");
		number = context.currentNumber();
		context.nextToken();
		commandNode = new ExpressionNode();
		commandNode.interpret(context);
	}

	@Override
	public void execute() {
		for(int i=0;i<number;i++) {
			commandNode.execute();
		}

	}

}
