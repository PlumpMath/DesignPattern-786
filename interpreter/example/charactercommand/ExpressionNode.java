package zjj.dp.interpreter.example.charactercommand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpressionNode implements INode {
	List<INode> list = new ArrayList<INode>();
	
	@Override
	public void interpret(Context context) {
		while(true) {
			String currentToken = context.currentToken();
			if(currentToken == null) {
				break;
			}else if(currentToken.equals("END")) {
				context.skipToken("END");
				break;
			}else {
				INode commandNode = new CommandNode();
				commandNode.interpret(context);
				list.add(commandNode);
			}
		}
	}

	@Override
	public void execute() {
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			INode node = (INode) iterator.next();
			node.execute();
		}
	}

}
