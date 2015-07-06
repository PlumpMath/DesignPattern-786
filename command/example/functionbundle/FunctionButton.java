package zjj.dp.command.example.functionbundle;

public class FunctionButton {
	private String buttonName;
	private ICommand command;
	
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
	public FunctionButton(String buttonName) {
		super();
		this.buttonName = buttonName;
	}
	
	public void click() {
		System.out.println(buttonName+" has been clicked");
		command.execute();
	}
}
