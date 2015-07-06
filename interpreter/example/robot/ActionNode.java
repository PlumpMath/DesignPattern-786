package zjj.dp.interpreter.example.robot;

public class ActionNode implements INode {
	private String action;
	
	public ActionNode(String action) {
		this.action = action;
	}
	
	@Override
	public String interpret() {
		if(this.action.equals("fast")) {
			return "快速移动";
		}else if(this.action.equals("normal")) {
			return "移动";
		}else if(this.action.equals("slow")) {
			return "缓慢移动";
		}
		else
			return null;
	}
}
