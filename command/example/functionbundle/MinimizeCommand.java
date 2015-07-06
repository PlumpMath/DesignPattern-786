package zjj.dp.command.example.functionbundle;

public class MinimizeCommand implements ICommand {
private IReciver reciver;
	
	public MinimizeCommand() {
		super();
		this.reciver = new MinimizeReciver();
	}

	@Override
	public void execute() {
		reciver.action();
	}

}
