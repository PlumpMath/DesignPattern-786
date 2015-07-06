package zjj.dp.interpreter.example.robot;

public class SentenceNode implements INode {
	private INode directionNode;
	private INode distanceNode;
	private INode actionNode;
	
	public SentenceNode(INode directionNode,INode actionNode, INode distanceNode
			) {
		super();
		this.directionNode = directionNode;
		this.distanceNode = distanceNode;
		this.actionNode = actionNode;
	}

	@Override
	public String interpret() {
		return this.directionNode.interpret()+this.actionNode.interpret()+this.distanceNode.interpret();
	}

}
