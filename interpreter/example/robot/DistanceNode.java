package zjj.dp.interpreter.example.robot;

public class DistanceNode implements INode {
	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}
	
	@Override
	public String interpret() {
		return this.distance;
	}

}
