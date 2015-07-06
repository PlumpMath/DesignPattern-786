package zjj.dp.interpreter.example.charactercommand;

public class CommandNode implements INode {
	private INode node;
	
	@Override
	public void interpret(Context context) {
		if(context.currentToken().equals("LOOP")) {
			node = new LoopNode();
			node.interpret(context);
		}else {
			node = new PrimitiveNode();
			node.interpret(context);
		}
	}

	@Override
	public void execute() {
		node.execute();
	}

}
