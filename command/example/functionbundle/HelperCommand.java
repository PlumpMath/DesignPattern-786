package zjj.dp.command.example.functionbundle;

public class HelperCommand implements ICommand {
	private IReciver reciver;
	
	public HelperCommand() {
		super();
		this.reciver = new HelperReciver();
	}

	@Override
	public void execute() {
		reciver.action();
	}

}
