package zjj.dp.interpreter.example.charactercommand;

public class PrimitiveNode implements INode {
	private String name;
	private String text;
	
	@Override
	public void interpret(Context context) {
		name = context.currentToken();
		context.skipToken(name);
		if(!(name.equals("PRINT")||name.equals("SPACE")||name.equals("BREAK"))) {
			System.out.println("Primitive error!");
		}
		if(name.equals("PRINT")) {
			text = context.currentToken();
			context.nextToken();
		}
	}

	@Override
	public void execute() {
		if(name.equals("PRINT")) {
			System.out.print(text);
		}
		if(name.equals("SPACE")) {
			System.out.print(" ");
		}
		if(name.equals("BREAK")) {
			System.out.println();
		}
	}

}
