package zjj.dp.interpreter.example.robot;

public class DirectionNode implements INode {
	private String direction;
	
	public DirectionNode(String direction) {
		this.direction = direction;
	}
	
	@Override
	public String interpret() {
		if(this.direction.equals("up")) {
			return "向上";
		}else if(this.direction.equals("down")) {
			return "向下";
		}else if(this.direction.equals("left")) {
			return "向左";
		}else if(this.direction.equals("right")) {
			return "向右";
		}
		else
			return null;
	}

}
