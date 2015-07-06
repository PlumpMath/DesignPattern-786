package zjj.dp.interpreter.example.robot;

public class AndNode implements INode {
	private INode left;
	private INode right;
	
	public AndNode(INode left, INode right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public String interpret() {
		return left.interpret()+"并且"+right.interpret();
	}

}
